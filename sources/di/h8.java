package di;

import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h8 implements RequestDelegate {
    public final int f8734a;
    public final j8 f8735b;

    public h8(j8 j8Var, int i7) {
        this.f8734a = i7;
        this.f8735b = j8Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8734a) {
            case 0:
                final j8 j8Var = this.f8735b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        j8 j8Var2 = j8Var;
                        switch (i7) {
                            case 0:
                                long j3 = j8Var2.f8866b;
                                int i10 = j8Var2.f8865a;
                                ArrayList arrayList = j8Var2.f8868e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j8Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            l8 l8Var = new l8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            l8Var.f8994c = true;
                                            l8Var.d = i12;
                                            j8Var2.h.put(Integer.valueOf(i12), l8Var);
                                        }
                                    }
                                    j8Var2.d = true;
                                    j8Var2.f8867c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), j8Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j8Var2.j();
                                    j8Var2.d = true;
                                    j8Var2.f8867c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), j8Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j8Var2.f8868e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j8Var2.f8868e.set(f11, tL_starGiftCollection3);
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
                final j8 j8Var2 = this.f8735b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        j8 j8Var22 = j8Var2;
                        switch (i7) {
                            case 0:
                                long j3 = j8Var22.f8866b;
                                int i10 = j8Var22.f8865a;
                                ArrayList arrayList = j8Var22.f8868e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l8 l8Var = new l8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            l8Var.f8994c = true;
                                            l8Var.d = i12;
                                            j8Var22.h.put(Integer.valueOf(i12), l8Var);
                                        }
                                    }
                                    j8Var22.d = true;
                                    j8Var22.f8867c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), j8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j8Var22.j();
                                    j8Var22.d = true;
                                    j8Var22.f8867c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), j8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j8Var22.f8868e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j8Var22.f8868e.set(f11, tL_starGiftCollection3);
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
                final j8 j8Var3 = this.f8735b;
                j8Var3.getClass();
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        j8 j8Var22 = j8Var3;
                        switch (i7) {
                            case 0:
                                long j3 = j8Var22.f8866b;
                                int i10 = j8Var22.f8865a;
                                ArrayList arrayList = j8Var22.f8868e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l8 l8Var = new l8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            l8Var.f8994c = true;
                                            l8Var.d = i12;
                                            j8Var22.h.put(Integer.valueOf(i12), l8Var);
                                        }
                                    }
                                    j8Var22.d = true;
                                    j8Var22.f8867c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), j8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j8Var22.j();
                                    j8Var22.d = true;
                                    j8Var22.f8867c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), j8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j8Var22.f8868e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j8Var22.f8868e.set(f11, tL_starGiftCollection3);
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
