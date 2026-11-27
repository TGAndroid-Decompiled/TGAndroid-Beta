package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class xwa implements RequestDelegate {
    public final byte a;
    public final zwa b;

    public xwa(zwa zwaVar, byte b) {
        this.a = b;
        this.b = zwaVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final zwa zwaVar = this.b;
        switch (b) {
            case 0:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        zwa zwaVar2 = zwaVar;
                        switch (b2) {
                            case 0:
                                long j = zwaVar2.b;
                                int i = zwaVar2.a;
                                ArrayList arrayList = zwaVar2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    zwaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (zwaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            axa axaVar = new axa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            axaVar.c = true;
                                            axaVar.d = i3;
                                            zwaVar2.h.put(Integer.valueOf(i3), axaVar);
                                        }
                                    }
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(234, Long.valueOf(j), zwaVar2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    zwaVar2.j();
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(234, Long.valueOf(j), zwaVar2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = zwaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        zwaVar2.e.set(f, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = zwaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        zwaVar2.e.set(f2, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                zwaVar2.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        zwa zwaVar2 = zwaVar;
                        switch (b2) {
                            case 0:
                                long j = zwaVar2.b;
                                int i = zwaVar2.a;
                                ArrayList arrayList = zwaVar2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    zwaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (zwaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            axa axaVar = new axa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            axaVar.c = true;
                                            axaVar.d = i3;
                                            zwaVar2.h.put(Integer.valueOf(i3), axaVar);
                                        }
                                    }
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(234, Long.valueOf(j), zwaVar2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    zwaVar2.j();
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(234, Long.valueOf(j), zwaVar2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = zwaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        zwaVar2.e.set(f, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = zwaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        zwaVar2.e.set(f2, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                zwaVar2.getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                zwaVar.getClass();
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        zwa zwaVar2 = zwaVar;
                        switch (b2) {
                            case 0:
                                long j = zwaVar2.b;
                                int i = zwaVar2.a;
                                ArrayList arrayList = zwaVar2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    zwaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (zwaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            axa axaVar = new axa(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            axaVar.c = true;
                                            axaVar.d = i3;
                                            zwaVar2.h.put(Integer.valueOf(i3), axaVar);
                                        }
                                    }
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(234, Long.valueOf(j), zwaVar2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    zwaVar2.j();
                                    zwaVar2.d = true;
                                    zwaVar2.c = false;
                                    jn7.f(i).k(234, Long.valueOf(j), zwaVar2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = zwaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        zwaVar2.e.set(f, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = zwaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        zwaVar2.e.set(f2, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                zwaVar2.getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
