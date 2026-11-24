package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wua implements RequestDelegate {
    public final byte a;
    public final yua b;

    public wua(yua yuaVar, byte b) {
        this.a = b;
        this.b = yuaVar;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        final yua yuaVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        yua yuaVar2 = yuaVar;
                        switch (b2) {
                            case 0:
                                long j = yuaVar2.b;
                                int i = yuaVar2.a;
                                ArrayList arrayList = yuaVar2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    yuaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (yuaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            ava avaVar = new ava(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            avaVar.c = true;
                                            avaVar.d = i3;
                                            yuaVar2.h.put(Integer.valueOf(i3), avaVar);
                                        }
                                    }
                                    yuaVar2.d = true;
                                    yuaVar2.c = false;
                                    nm7.f(i).k(234, Long.valueOf(j), yuaVar2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    yuaVar2.j();
                                    yuaVar2.d = true;
                                    yuaVar2.c = false;
                                    nm7.f(i).k(234, Long.valueOf(j), yuaVar2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = yuaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        yuaVar2.e.set(f, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = yuaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        yuaVar2.e.set(f2, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                yuaVar2.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        yua yuaVar2 = yuaVar;
                        switch (b2) {
                            case 0:
                                long j = yuaVar2.b;
                                int i = yuaVar2.a;
                                ArrayList arrayList = yuaVar2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    yuaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (yuaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            ava avaVar = new ava(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            avaVar.c = true;
                                            avaVar.d = i3;
                                            yuaVar2.h.put(Integer.valueOf(i3), avaVar);
                                        }
                                    }
                                    yuaVar2.d = true;
                                    yuaVar2.c = false;
                                    nm7.f(i).k(234, Long.valueOf(j), yuaVar2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    yuaVar2.j();
                                    yuaVar2.d = true;
                                    yuaVar2.c = false;
                                    nm7.f(i).k(234, Long.valueOf(j), yuaVar2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = yuaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        yuaVar2.e.set(f, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = yuaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        yuaVar2.e.set(f2, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                yuaVar2.getClass();
                                return;
                        }
                    }
                });
                return;
            default:
                yuaVar.getClass();
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        byte b2 = r3;
                        TLObject tLObject2 = tLObject;
                        yua yuaVar2 = yuaVar;
                        switch (b2) {
                            case 0:
                                long j = yuaVar2.b;
                                int i = yuaVar2.a;
                                ArrayList arrayList = yuaVar2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    yuaVar2.j();
                                    int size = arrayList.size();
                                    int i2 = 0;
                                    while (i2 < size) {
                                        Object obj = arrayList.get(i2);
                                        i2++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (yuaVar2.e(tL_starGiftCollection.collection_id) == null) {
                                            ava avaVar = new ava(i, j, false);
                                            int i3 = tL_starGiftCollection.collection_id;
                                            avaVar.c = true;
                                            avaVar.d = i3;
                                            yuaVar2.h.put(Integer.valueOf(i3), avaVar);
                                        }
                                    }
                                    yuaVar2.d = true;
                                    yuaVar2.c = false;
                                    nm7.f(i).k(234, Long.valueOf(j), yuaVar2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    yuaVar2.j();
                                    yuaVar2.d = true;
                                    yuaVar2.c = false;
                                    nm7.f(i).k(234, Long.valueOf(j), yuaVar2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f = yuaVar2.f(tL_starGiftCollection2.collection_id);
                                    if (f >= 0) {
                                        yuaVar2.e.set(f, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f2 = yuaVar2.f(tL_starGiftCollection3.collection_id);
                                    if (f2 >= 0) {
                                        yuaVar2.e.set(f2, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                yuaVar2.getClass();
                                return;
                        }
                    }
                });
                return;
        }
    }
}
