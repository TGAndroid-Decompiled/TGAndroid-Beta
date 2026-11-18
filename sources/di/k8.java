package di;

import java.util.ArrayList;
import org.telegram.messenger.ks;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class k8 implements RequestDelegate {
    public final int f9191a;
    public final m8 f9192b;

    public k8(m8 m8Var, int i7) {
        this.f9191a = i7;
        this.f9192b = m8Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9191a) {
            case 0:
                final m8 m8Var = this.f9192b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        m8 m8Var2 = m8Var;
                        switch (i7) {
                            case 0:
                                long j3 = m8Var2.f9320b;
                                int i10 = m8Var2.f9319a;
                                ArrayList arrayList = m8Var2.f9322e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m8Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            o8 o8Var = new o8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            o8Var.f9460c = true;
                                            o8Var.d = i12;
                                            m8Var2.h.put(Integer.valueOf(i12), o8Var);
                                        }
                                    }
                                    m8Var2.d = true;
                                    m8Var2.f9321c = false;
                                    ks.f(i10).k(233, Long.valueOf(j3), m8Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    m8Var2.j();
                                    m8Var2.d = true;
                                    m8Var2.f9321c = false;
                                    ks.f(i10).k(233, Long.valueOf(j3), m8Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                m8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        m8Var2.f9322e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                m8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = m8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        m8Var2.f9322e.set(f11, tL_starGiftCollection3);
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
                final m8 m8Var2 = this.f9192b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        m8 m8Var22 = m8Var2;
                        switch (i7) {
                            case 0:
                                long j3 = m8Var22.f9320b;
                                int i10 = m8Var22.f9319a;
                                ArrayList arrayList = m8Var22.f9322e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            o8 o8Var = new o8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            o8Var.f9460c = true;
                                            o8Var.d = i12;
                                            m8Var22.h.put(Integer.valueOf(i12), o8Var);
                                        }
                                    }
                                    m8Var22.d = true;
                                    m8Var22.f9321c = false;
                                    ks.f(i10).k(233, Long.valueOf(j3), m8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    m8Var22.j();
                                    m8Var22.d = true;
                                    m8Var22.f9321c = false;
                                    ks.f(i10).k(233, Long.valueOf(j3), m8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        m8Var22.f9322e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = m8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        m8Var22.f9322e.set(f11, tL_starGiftCollection3);
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
                final m8 m8Var3 = this.f9192b;
                m8Var3.getClass();
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        m8 m8Var22 = m8Var3;
                        switch (i7) {
                            case 0:
                                long j3 = m8Var22.f9320b;
                                int i10 = m8Var22.f9319a;
                                ArrayList arrayList = m8Var22.f9322e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    m8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (m8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            o8 o8Var = new o8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            o8Var.f9460c = true;
                                            o8Var.d = i12;
                                            m8Var22.h.put(Integer.valueOf(i12), o8Var);
                                        }
                                    }
                                    m8Var22.d = true;
                                    m8Var22.f9321c = false;
                                    ks.f(i10).k(233, Long.valueOf(j3), m8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    m8Var22.j();
                                    m8Var22.d = true;
                                    m8Var22.f9321c = false;
                                    ks.f(i10).k(233, Long.valueOf(j3), m8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = m8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        m8Var22.f9322e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                m8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = m8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        m8Var22.f9322e.set(f11, tL_starGiftCollection3);
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
