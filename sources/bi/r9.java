package bi;

import java.util.ArrayList;
import org.telegram.messenger.qs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class r9 implements RequestDelegate {
    public final int f4634a;
    public final t9 f4635b;

    public r9(t9 t9Var, int i7) {
        this.f4634a = i7;
        this.f4635b = t9Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f4634a) {
            case 0:
                final t9 t9Var = this.f4635b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        t9 t9Var2 = t9Var;
                        switch (i7) {
                            case 0:
                                long j3 = t9Var2.f4756b;
                                int i10 = t9Var2.f4755a;
                                ArrayList arrayList = t9Var2.f4758e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    t9Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (t9Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            v9 v9Var = new v9(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            v9Var.f4906c = true;
                                            v9Var.d = i12;
                                            t9Var2.h.put(Integer.valueOf(i12), v9Var);
                                        }
                                    }
                                    t9Var2.d = true;
                                    t9Var2.f4757c = false;
                                    qs.f(i10).k(231, Long.valueOf(j3), t9Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    t9Var2.j();
                                    t9Var2.d = true;
                                    t9Var2.f4757c = false;
                                    qs.f(i10).k(231, Long.valueOf(j3), t9Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                t9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = t9Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        t9Var2.f4758e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                t9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = t9Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        t9Var2.f4758e.set(f11, tL_starGiftCollection3);
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
                final t9 t9Var2 = this.f4635b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        t9 t9Var22 = t9Var2;
                        switch (i7) {
                            case 0:
                                long j3 = t9Var22.f4756b;
                                int i10 = t9Var22.f4755a;
                                ArrayList arrayList = t9Var22.f4758e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    t9Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (t9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v9 v9Var = new v9(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            v9Var.f4906c = true;
                                            v9Var.d = i12;
                                            t9Var22.h.put(Integer.valueOf(i12), v9Var);
                                        }
                                    }
                                    t9Var22.d = true;
                                    t9Var22.f4757c = false;
                                    qs.f(i10).k(231, Long.valueOf(j3), t9Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    t9Var22.j();
                                    t9Var22.d = true;
                                    t9Var22.f4757c = false;
                                    qs.f(i10).k(231, Long.valueOf(j3), t9Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = t9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        t9Var22.f4758e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = t9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        t9Var22.f4758e.set(f11, tL_starGiftCollection3);
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
                final t9 t9Var3 = this.f4635b;
                t9Var3.getClass();
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        t9 t9Var22 = t9Var3;
                        switch (i7) {
                            case 0:
                                long j3 = t9Var22.f4756b;
                                int i10 = t9Var22.f4755a;
                                ArrayList arrayList = t9Var22.f4758e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    t9Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (t9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            v9 v9Var = new v9(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            v9Var.f4906c = true;
                                            v9Var.d = i12;
                                            t9Var22.h.put(Integer.valueOf(i12), v9Var);
                                        }
                                    }
                                    t9Var22.d = true;
                                    t9Var22.f4757c = false;
                                    qs.f(i10).k(231, Long.valueOf(j3), t9Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    t9Var22.j();
                                    t9Var22.d = true;
                                    t9Var22.f4757c = false;
                                    qs.f(i10).k(231, Long.valueOf(j3), t9Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = t9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        t9Var22.f4758e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                t9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = t9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        t9Var22.f4758e.set(f11, tL_starGiftCollection3);
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
