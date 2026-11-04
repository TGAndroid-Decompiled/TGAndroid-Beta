package ci;

import java.util.ArrayList;
import org.telegram.messenger.hs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class q8 implements RequestDelegate {
    public final int f5846a;
    public final s8 f5847b;

    public q8(s8 s8Var, int i3) {
        this.f5846a = i3;
        this.f5847b = s8Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5846a) {
            case 0:
                final s8 s8Var = this.f5847b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        s8 s8Var2 = s8Var;
                        switch (i3) {
                            case 0:
                                long j10 = s8Var2.f5966b;
                                int i10 = s8Var2.f5965a;
                                ArrayList arrayList = s8Var2.f5968e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    s8Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (s8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            v8 v8Var = new v8(i10, j10, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            v8Var.f6196c = true;
                                            v8Var.d = i12;
                                            s8Var2.h.put(Integer.valueOf(i12), v8Var);
                                        }
                                    }
                                    s8Var2.d = true;
                                    s8Var2.f5967c = false;
                                    hs.f(i10).k(231, Long.valueOf(j10), s8Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    s8Var2.j();
                                    s8Var2.d = true;
                                    s8Var2.f5967c = false;
                                    hs.f(i10).k(231, Long.valueOf(j10), s8Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                s8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = s8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        s8Var2.f5968e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                s8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = s8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        s8Var2.f5968e.set(f11, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final s8 s8Var2 = this.f5847b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        s8 s8Var22 = s8Var2;
                        switch (i3) {
                            case 0:
                                long j10 = s8Var22.f5966b;
                                int i10 = s8Var22.f5965a;
                                ArrayList arrayList = s8Var22.f5968e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    s8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (s8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v8 v8Var = new v8(i10, j10, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            v8Var.f6196c = true;
                                            v8Var.d = i12;
                                            s8Var22.h.put(Integer.valueOf(i12), v8Var);
                                        }
                                    }
                                    s8Var22.d = true;
                                    s8Var22.f5967c = false;
                                    hs.f(i10).k(231, Long.valueOf(j10), s8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    s8Var22.j();
                                    s8Var22.d = true;
                                    s8Var22.f5967c = false;
                                    hs.f(i10).k(231, Long.valueOf(j10), s8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = s8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        s8Var22.f5968e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = s8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        s8Var22.f5968e.set(f11, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final s8 s8Var3 = this.f5847b;
                s8Var3.getClass();
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLObject tLObject2 = tLObject;
                        s8 s8Var22 = s8Var3;
                        switch (i3) {
                            case 0:
                                long j10 = s8Var22.f5966b;
                                int i10 = s8Var22.f5965a;
                                ArrayList arrayList = s8Var22.f5968e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    s8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (s8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v8 v8Var = new v8(i10, j10, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            v8Var.f6196c = true;
                                            v8Var.d = i12;
                                            s8Var22.h.put(Integer.valueOf(i12), v8Var);
                                        }
                                    }
                                    s8Var22.d = true;
                                    s8Var22.f5967c = false;
                                    hs.f(i10).k(231, Long.valueOf(j10), s8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    s8Var22.j();
                                    s8Var22.d = true;
                                    s8Var22.f5967c = false;
                                    hs.f(i10).k(231, Long.valueOf(j10), s8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = s8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        s8Var22.f5968e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                s8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = s8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        s8Var22.f5968e.set(f11, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
