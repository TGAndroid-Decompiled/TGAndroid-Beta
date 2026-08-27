package org.telegram.messenger;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class CacheFetcher<Args, R> {
    private HashMap<Pair<Integer, Args>, R> cachedResults;
    private HashMap<Pair<Integer, Args>, Long> lastRequestedRemotely;
    private HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> loadingCallbacks;
    private final long requestRemotelyTimeout;

    public CacheFetcher() {
        this(240000);
    }

    private void cacheResult(Pair<Integer, Args> pair, R r10) {
        if (useCache(pair.second)) {
            if (this.cachedResults == null) {
                this.cachedResults = new HashMap<>();
            }
            this.cachedResults.put(pair, r10);
        }
    }

    private void callCallbacks(Pair<Integer, Args> pair, R r10, boolean z10) {
        AndroidUtilities.runOnUIThread(new qj(this, pair, r10, z10, 1));
    }

    private R getCachedResult(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, R> map = this.cachedResults;
        if (map == null) {
            return null;
        }
        return map.get(pair);
    }

    private boolean isLoading(Pair<Integer, Args> pair) {
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> map = this.loadingCallbacks;
        return (map == null || map.get(pair) == null) ? false : true;
    }

    public void lambda$callCallbacks$3(Pair pair, Object obj, boolean z10) {
        ArrayList<Utilities.Callback<R>> arrayList;
        HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> map = this.loadingCallbacks;
        if (map == null || (arrayList = map.get(pair)) == null) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Utilities.Callback<R> callback = arrayList.get(i10);
            i10++;
            callback.run(obj);
        }
        if (z10) {
            arrayList.clear();
        }
        if (z10) {
            this.loadingCallbacks.remove(pair);
        }
    }

    public void lambda$fetch$0(Pair pair, Object obj, int i10, Object obj2, Boolean bool, Object obj3, Long l10, Boolean bool2) {
        Object obj4;
        if (bool2.booleanValue()) {
            saveLastRequested(pair);
        }
        if (bool.booleanValue()) {
            cacheResult(pair, obj);
            callCallbacks(pair, obj, true);
            return;
        }
        if (obj3 != null) {
            obj4 = obj3;
            setLocal(i10, obj2, obj4, l10.longValue());
            cacheResult(pair, obj4);
        } else {
            obj4 = obj3;
        }
        callCallbacks(pair, obj4, true);
    }

    public void lambda$fetch$1(final Pair pair, final Object obj, final int i10, Long l10, final Object obj2) {
        if (!shouldRequest(pair)) {
            cacheResult(pair, obj2);
            callCallbacks(pair, obj2, true);
            return;
        }
        if (obj2 != 0 && emitLocal(obj)) {
            cacheResult(pair, obj2);
            callCallbacks(pair, obj2, false);
        }
        getRemote(i10, obj, l10.longValue(), new Utilities.Callback4() {
            @Override
            public final void run(Object obj3, Object obj4, Object obj5, Object obj6) {
                this.f21114a.lambda$fetch$0(pair, obj2, i10, obj, (Boolean) obj3, obj4, (Long) obj5, (Boolean) obj6);
            }
        });
    }

    public void lambda$saveCallback$2(Pair pair, Utilities.Callback callback) {
        if (this.loadingCallbacks == null) {
            this.loadingCallbacks = new HashMap<>();
        }
        ArrayList<Utilities.Callback<R>> arrayList = this.loadingCallbacks.get(pair);
        if (arrayList == null) {
            HashMap<Pair<Integer, Args>, ArrayList<Utilities.Callback<R>>> map = this.loadingCallbacks;
            ArrayList<Utilities.Callback<R>> arrayList2 = new ArrayList<>();
            map.put(pair, arrayList2);
            arrayList = arrayList2;
        }
        arrayList.add(callback);
    }

    private void saveCallback(Pair<Integer, Args> pair, Utilities.Callback<R> callback) {
        if (callback == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new f0(this, pair, callback, 9));
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

    public boolean emitLocal(Args args) {
        return false;
    }

    public void fetch(final int i10, final Args args, Utilities.Callback<R> callback) {
        final Pair<Integer, Args> pair = new Pair<>(Integer.valueOf(i10), args);
        if (isLoading(pair)) {
            saveCallback(pair, callback);
            return;
        }
        R cachedResult = getCachedResult(pair);
        if (cachedResult == null || shouldRequest(pair)) {
            saveCallback(pair, callback);
            getLocal(i10, args, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f21207a.lambda$fetch$1(pair, args, i10, (Long) obj, obj2);
                }
            });
        } else if (callback != null) {
            callback.run(cachedResult);
        }
    }

    public void forceRequest(int i10, Args args) {
        if (this.lastRequestedRemotely == null) {
            return;
        }
        Pair pair = new Pair(Integer.valueOf(i10), args);
        this.lastRequestedRemotely.remove(pair);
        if (saveLastTimeRequested()) {
            setSavedLastTimeRequested(pair.hashCode(), 0L);
        }
    }

    public void getLocal(int i10, Args args, Utilities.Callback2<Long, R> callback2) {
        callback2.run(0L, null);
    }

    public long getSavedLastTimeRequested(int i10) {
        return 0L;
    }

    public boolean saveLastTimeRequested() {
        return false;
    }

    public boolean useCache(Args args) {
        return true;
    }

    public CacheFetcher(int i10) {
        this.requestRemotelyTimeout = i10;
    }

    public void setSavedLastTimeRequested(int i10, long j10) {
    }

    public void getRemote(int i10, Args args, long j10, Utilities.Callback4<Boolean, R, Long, Boolean> callback4) {
    }

    public void setLocal(int i10, Args args, R r10, long j10) {
    }
}
