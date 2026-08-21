package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class CacheFetcher<Args, R> {
    private HashMap<Pair<Integer, Args>, R> cachedResults;
    private HashMap<Pair<Integer, Args>, Long> lastRequestedRemotely;
    private HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> loadingCallbacks;
    private final long requestRemotelyTimeout;

    protected boolean emitLocal(Args args) {
        return false;
    }

    protected void getRemote(int i, Args args, long j, Utilities.Callback4<Boolean, R, Long, Boolean> callback4) {
    }

    protected long getSavedLastTimeRequested(int i) {
        return 0L;
    }

    protected boolean saveLastTimeRequested() {
        return false;
    }

    protected void setLocal(int i, Args args, R r, long j) {
    }

    protected void setSavedLastTimeRequested(int i, long j) {
    }

    protected boolean useCache(Args args) {
        return true;
    }

    protected void getLocal(int i, Args args, Utilities.Callback2<Long, R> callback2) {
        callback2.run(0L, null);
    }

    public CacheFetcher() {
        this(240000);
    }

    public CacheFetcher(int i) {
        this.requestRemotelyTimeout = i;
    }

    public void fetch(final int i, final Args args, Utilities.Callback<R> callback) {
        final Pair<Integer, Args> pair = new Pair<>(Integer.valueOf(i), args);
        if (isLoading(pair)) {
            saveCallback(pair, callback);
            return;
        }
        R cachedResult = getCachedResult(pair);
        if (cachedResult == null || shouldRequest(pair)) {
            saveCallback(pair, callback);
            getLocal(i, args, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    CacheFetcher.$r8$lambda$vKB003R5Kta8BpKYwF16lmDbD4c(this.f$0, pair, args, i, (Long) obj, obj2);
                }
            });
        } else if (callback != null) {
            callback.run(cachedResult);
        }
    }

    public static void $r8$lambda$vKB003R5Kta8BpKYwF16lmDbD4c(final CacheFetcher cacheFetcher, final Pair pair, final Object obj, final int i, Long l, final Object obj2) {
        if (cacheFetcher.shouldRequest(pair)) {
            if (obj2 != null && cacheFetcher.emitLocal(obj)) {
                cacheFetcher.cacheResult(pair, obj2);
                cacheFetcher.callCallbacks(pair, obj2, false);
            }
            cacheFetcher.getRemote(i, obj, l.longValue(), new Utilities.Callback4() {
                @Override
                public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                    CacheFetcher.m373$r8$lambda$igJR4yzJOQFxj1rf2xX47xcXuQ(this.f$0, pair, obj2, i, obj, (Boolean) obj3, obj4, (Long) obj5, (Boolean) obj6);
                }
            });
            return;
        }
        cacheFetcher.cacheResult(pair, obj2);
        cacheFetcher.callCallbacks(pair, obj2, true);
    }

    public static void m373$r8$lambda$igJR4yzJOQFxj1rf2xX47xcXuQ(CacheFetcher cacheFetcher, Pair pair, Object obj, int i, Object obj2, Boolean bool, Object obj3, Long l, Boolean bool2) {
        CacheFetcher cacheFetcher2;
        Object obj4;
        cacheFetcher.getClass();
        if (bool2.booleanValue()) {
            cacheFetcher.saveLastRequested(pair);
        }
        if (bool.booleanValue()) {
            cacheFetcher.cacheResult(pair, obj);
            cacheFetcher.callCallbacks(pair, obj, true);
            return;
        }
        if (obj3 != null) {
            CacheFetcher cacheFetcher3 = cacheFetcher;
            obj4 = obj3;
            cacheFetcher3.setLocal(i, obj2, obj4, l.longValue());
            cacheFetcher3.cacheResult(pair, obj4);
            cacheFetcher2 = cacheFetcher3;
        } else {
            cacheFetcher2 = cacheFetcher;
            obj4 = obj3;
        }
        cacheFetcher2.callCallbacks(pair, obj4, true);
    }

    private R getCachedResult(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, R> map = this.cachedResults;
        if (map == null) {
            return null;
        }
        return map.get(pair);
    }

    private void cacheResult(Pair<Integer, Args> pair, R r) {
        if (useCache(pair.second)) {
            if (this.cachedResults == null) {
                this.cachedResults = new HashMap<>();
            }
            this.cachedResults.put(pair, r);
        }
    }

    private void saveLastRequested(Pair<Integer, Args> pair) {
        if (this.lastRequestedRemotely == null) {
            this.lastRequestedRemotely = new HashMap<>();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.lastRequestedRemotely.put(pair, Long.valueOf(jCurrentTimeMillis));
        if (saveLastTimeRequested()) {
            setSavedLastTimeRequested(pair.hashCode(), jCurrentTimeMillis);
        }
    }

    private boolean shouldRequest(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, Long> map = this.lastRequestedRemotely;
        Long lValueOf = map != null ? map.get(pair) : null;
        if (saveLastTimeRequested() && lValueOf == null) {
            lValueOf = Long.valueOf(getSavedLastTimeRequested(pair.hashCode()));
        }
        return lValueOf == null || System.currentTimeMillis() - lValueOf.longValue() >= this.requestRemotelyTimeout;
    }

    public void forceRequest(int i, Args args) {
        if (this.lastRequestedRemotely == null) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i), args);
        this.lastRequestedRemotely.remove(pair);
        if (saveLastTimeRequested()) {
            setSavedLastTimeRequested(pair.hashCode(), 0L);
        }
    }

    private boolean isLoading(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> map = this.loadingCallbacks;
        return (map == null || map.get(pair) == null) ? false : true;
    }

    private void saveCallback(final Pair<Integer, Args> pair, final Utilities.Callback<R> callback) {
        if (callback == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheFetcher.$r8$lambda$YYG6dtJSqtyEXKjDlAhxnX0vONg(this.f$0, pair, callback);
            }
        });
    }

    public static void $r8$lambda$YYG6dtJSqtyEXKjDlAhxnX0vONg(CacheFetcher cacheFetcher, Pair pair, Utilities.Callback callback) {
        if (cacheFetcher.loadingCallbacks == null) {
            cacheFetcher.loadingCallbacks = new HashMap<>();
        }
        ArrayList<Utilities.Callback<R>> arrayList = cacheFetcher.loadingCallbacks.get(pair);
        if (arrayList == null) {
            HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> map = cacheFetcher.loadingCallbacks;
            arrayList = new ArrayList<>();
            map.put(pair, arrayList);
        }
        arrayList.add(callback);
    }

    private void callCallbacks(final Pair<Integer, Args> pair, final R r, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheFetcher.$r8$lambda$pneNqVUnFb75PaQjLCFyQ7yTNYw(this.f$0, pair, r, z);
            }
        });
    }

    public static void $r8$lambda$pneNqVUnFb75PaQjLCFyQ7yTNYw(CacheFetcher cacheFetcher, Pair pair, Object obj, boolean z) {
        ArrayList<Utilities.Callback<R>> arrayList;
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> map = cacheFetcher.loadingCallbacks;
        if (map == null || (arrayList = map.get(pair)) == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Utilities.Callback<R> callback = arrayList.get(i);
            i++;
            callback.run(obj);
        }
        if (z) {
            arrayList.clear();
        }
        if (z) {
            cacheFetcher.loadingCallbacks.remove(pair);
        }
    }
}
