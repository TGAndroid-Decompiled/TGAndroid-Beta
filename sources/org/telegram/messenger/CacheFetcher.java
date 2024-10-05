package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.Utilities;

public abstract class CacheFetcher<Args, R> {
    private HashMap<Pair<Integer, Args>, R> cachedResults;
    private HashMap<Pair<Integer, Args>, Long> lastRequestedRemotely;
    private HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> loadingCallbacks;
    private final long requestRemotelyTimeout;

    public CacheFetcher() {
        this(240000);
    }

    public CacheFetcher(int i) {
        this.requestRemotelyTimeout = i;
    }

    private void cacheResult(Pair<Integer, Args> pair, R r) {
        if (useCache(pair.second)) {
            if (this.cachedResults == null) {
                this.cachedResults = new HashMap<>();
            }
            this.cachedResults.put(pair, r);
        }
    }

    private void callCallbacks(final Pair<Integer, Args> pair, final R r, final boolean z) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheFetcher.this.lambda$callCallbacks$3(pair, r, z);
            }
        });
    }

    private R getCachedResult(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, R> hashMap = this.cachedResults;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(pair);
    }

    private boolean isLoading(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> hashMap = this.loadingCallbacks;
        return (hashMap == null || hashMap.get(pair) == null) ? false : true;
    }

    public void lambda$callCallbacks$3(Pair pair, Object obj, boolean z) {
        ArrayList<Utilities.Callback<R>> arrayList;
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> hashMap = this.loadingCallbacks;
        if (hashMap == null || (arrayList = hashMap.get(pair)) == null) {
            return;
        }
        Iterator<Utilities.Callback<R>> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().run(obj);
        }
        if (z) {
            arrayList.clear();
        }
        if (z) {
            this.loadingCallbacks.remove(pair);
        }
    }

    public void lambda$fetch$0(Pair pair, Object obj, int i, Object obj2, Boolean bool, Object obj3, Long l, Boolean bool2) {
        if (bool2.booleanValue()) {
            saveLastRequested(pair);
        }
        if (bool.booleanValue()) {
            cacheResult(pair, obj);
            callCallbacks(pair, obj, true);
        } else {
            if (obj3 != 0) {
                setLocal(i, obj2, obj3, l.longValue());
                cacheResult(pair, obj3);
            }
            callCallbacks(pair, obj3, true);
        }
    }

    public void lambda$fetch$1(final Pair pair, final Object obj, final int i, Long l, final Object obj2) {
        if (!shouldRequest(pair)) {
            cacheResult(pair, obj2);
            callCallbacks(pair, obj2, true);
            return;
        }
        if (obj2 != 0 && emitLocal(obj)) {
            cacheResult(pair, obj2);
            callCallbacks(pair, obj2, false);
        }
        getRemote(i, obj, l.longValue(), new Utilities.Callback4() {
            @Override
            public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                CacheFetcher.this.lambda$fetch$0(pair, obj2, i, obj, (Boolean) obj3, obj4, (Long) obj5, (Boolean) obj6);
            }
        });
    }

    public void lambda$saveCallback$2(Pair pair, Utilities.Callback callback) {
        if (this.loadingCallbacks == null) {
            this.loadingCallbacks = new HashMap<>();
        }
        ArrayList<Utilities.Callback<R>> arrayList = this.loadingCallbacks.get(pair);
        if (arrayList == null) {
            HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> hashMap = this.loadingCallbacks;
            ArrayList<Utilities.Callback<R>> arrayList2 = new ArrayList<>();
            hashMap.put(pair, arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(callback);
    }

    private void saveCallback(final Pair<Integer, Args> pair, final Utilities.Callback<R> callback) {
        if (callback == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                CacheFetcher.this.lambda$saveCallback$2(pair, callback);
            }
        });
    }

    private void saveLastRequested(Pair<Integer, Args> pair) {
        if (this.lastRequestedRemotely == null) {
            this.lastRequestedRemotely = new HashMap<>();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.lastRequestedRemotely.put(pair, Long.valueOf(currentTimeMillis));
        if (saveLastTimeRequested()) {
            setSavedLastTimeRequested(pair.hashCode(), currentTimeMillis);
        }
    }

    private boolean shouldRequest(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, Long> hashMap = this.lastRequestedRemotely;
        Long l = hashMap != null ? hashMap.get(pair) : null;
        if (saveLastTimeRequested() && l == null) {
            l = Long.valueOf(getSavedLastTimeRequested(pair.hashCode()));
        }
        return l == null || System.currentTimeMillis() - l.longValue() >= this.requestRemotelyTimeout;
    }

    protected boolean emitLocal(Args args) {
        return false;
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
                    CacheFetcher.this.lambda$fetch$1(pair, args, i, (Long) obj, obj2);
                }
            });
        } else if (callback != null) {
            callback.run(cachedResult);
        }
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

    protected void getLocal(int i, Args args, Utilities.Callback2<Long, R> callback2) {
        callback2.run(0L, null);
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
}
