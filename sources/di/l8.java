package di;

import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class l8 implements RequestDelegate {
    public final int f9296a;
    public final n8 f9297b;

    public l8(n8 n8Var, int i7) {
        this.f9296a = i7;
        this.f9297b = n8Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9296a) {
            case 0:
                final n8 n8Var = this.f9297b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        n8 n8Var2 = n8Var;
                        switch (i7) {
                            case 0:
                                long j3 = n8Var2.f9407b;
                                int i10 = n8Var2.f9406a;
                                ArrayList arrayList = n8Var2.f9409e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    n8Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (n8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            p8 p8Var = new p8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            p8Var.f9545c = true;
                                            p8Var.d = i12;
                                            n8Var2.h.put(Integer.valueOf(i12), p8Var);
                                        }
                                    }
                                    n8Var2.d = true;
                                    n8Var2.f9408c = false;
                                    ls.f(i10).k(233, Long.valueOf(j3), n8Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    n8Var2.j();
                                    n8Var2.d = true;
                                    n8Var2.f9408c = false;
                                    ls.f(i10).k(233, Long.valueOf(j3), n8Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                n8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = n8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        n8Var2.f9409e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                n8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = n8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        n8Var2.f9409e.set(f11, tL_starGiftCollection3);
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
                final n8 n8Var2 = this.f9297b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        n8 n8Var22 = n8Var2;
                        switch (i7) {
                            case 0:
                                long j3 = n8Var22.f9407b;
                                int i10 = n8Var22.f9406a;
                                ArrayList arrayList = n8Var22.f9409e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    n8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (n8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            p8 p8Var = new p8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            p8Var.f9545c = true;
                                            p8Var.d = i12;
                                            n8Var22.h.put(Integer.valueOf(i12), p8Var);
                                        }
                                    }
                                    n8Var22.d = true;
                                    n8Var22.f9408c = false;
                                    ls.f(i10).k(233, Long.valueOf(j3), n8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    n8Var22.j();
                                    n8Var22.d = true;
                                    n8Var22.f9408c = false;
                                    ls.f(i10).k(233, Long.valueOf(j3), n8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = n8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        n8Var22.f9409e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = n8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        n8Var22.f9409e.set(f11, tL_starGiftCollection3);
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
                final n8 n8Var3 = this.f9297b;
                n8Var3.getClass();
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        n8 n8Var22 = n8Var3;
                        switch (i7) {
                            case 0:
                                long j3 = n8Var22.f9407b;
                                int i10 = n8Var22.f9406a;
                                ArrayList arrayList = n8Var22.f9409e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    n8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (n8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            p8 p8Var = new p8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            p8Var.f9545c = true;
                                            p8Var.d = i12;
                                            n8Var22.h.put(Integer.valueOf(i12), p8Var);
                                        }
                                    }
                                    n8Var22.d = true;
                                    n8Var22.f9408c = false;
                                    ls.f(i10).k(233, Long.valueOf(j3), n8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    n8Var22.j();
                                    n8Var22.d = true;
                                    n8Var22.f9408c = false;
                                    ls.f(i10).k(233, Long.valueOf(j3), n8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = n8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        n8Var22.f9409e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                n8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = n8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        n8Var22.f9409e.set(f11, tL_starGiftCollection3);
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
