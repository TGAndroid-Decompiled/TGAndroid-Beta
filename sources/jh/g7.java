package jh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class g7 implements RequestDelegate {
    public final int f12125a;
    public final i7 f12126b;

    public g7(i7 i7Var, int i10) {
        this.f12125a = i10;
        this.f12126b = i7Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12125a) {
            case 0:
                final i7 i7Var = this.f12126b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        i7 i7Var2 = i7Var;
                        switch (i10) {
                            case 0:
                                long j10 = i7Var2.f12260b;
                                int i11 = i7Var2.f12259a;
                                ArrayList arrayList = i7Var2.f12262e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i7Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            k7 k7Var = new k7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            k7Var.f12380c = true;
                                            k7Var.d = i13;
                                            i7Var2.h.put(Integer.valueOf(i13), k7Var);
                                        }
                                    }
                                    i7Var2.d = true;
                                    i7Var2.f12261c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    i7Var2.j();
                                    i7Var2.d = true;
                                    i7Var2.f12261c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                i7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f9 = i7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f9 >= 0) {
                                        i7Var2.f12262e.set(f9, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i7Var2.f12262e.set(f10, tL_starGiftCollection3);
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
                final i7 i7Var2 = this.f12126b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        i7 i7Var22 = i7Var2;
                        switch (i10) {
                            case 0:
                                long j10 = i7Var22.f12260b;
                                int i11 = i7Var22.f12259a;
                                ArrayList arrayList = i7Var22.f12262e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i7Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k7 k7Var = new k7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            k7Var.f12380c = true;
                                            k7Var.d = i13;
                                            i7Var22.h.put(Integer.valueOf(i13), k7Var);
                                        }
                                    }
                                    i7Var22.d = true;
                                    i7Var22.f12261c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    i7Var22.j();
                                    i7Var22.d = true;
                                    i7Var22.f12261c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f9 = i7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f9 >= 0) {
                                        i7Var22.f12262e.set(f9, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i7Var22.f12262e.set(f10, tL_starGiftCollection3);
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
                final i7 i7Var3 = this.f12126b;
                i7Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        i7 i7Var22 = i7Var3;
                        switch (i10) {
                            case 0:
                                long j10 = i7Var22.f12260b;
                                int i11 = i7Var22.f12259a;
                                ArrayList arrayList = i7Var22.f12262e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    i7Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (i7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            k7 k7Var = new k7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            k7Var.f12380c = true;
                                            k7Var.d = i13;
                                            i7Var22.h.put(Integer.valueOf(i13), k7Var);
                                        }
                                    }
                                    i7Var22.d = true;
                                    i7Var22.f12261c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    i7Var22.j();
                                    i7Var22.d = true;
                                    i7Var22.f12261c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), i7Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f9 = i7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f9 >= 0) {
                                        i7Var22.f12262e.set(f9, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                i7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = i7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        i7Var22.f12262e.set(f10, tL_starGiftCollection3);
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
