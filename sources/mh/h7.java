package mh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class h7 implements RequestDelegate {
    public final int f14180a;
    public final j7 f14181b;

    public h7(j7 j7Var, int i10) {
        this.f14180a = i10;
        this.f14181b = j7Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14180a) {
            case 0:
                final j7 j7Var = this.f14181b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        j7 j7Var2 = j7Var;
                        switch (i10) {
                            case 0:
                                long j10 = j7Var2.f14301b;
                                int i11 = j7Var2.f14300a;
                                ArrayList arrayList = j7Var2.f14303e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j7Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            l7 l7Var = new l7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l7Var.f14398c = true;
                                            l7Var.d = i13;
                                            j7Var2.h.put(Integer.valueOf(i13), l7Var);
                                        }
                                    }
                                    j7Var2.d = true;
                                    j7Var2.f14302c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j7Var2.j();
                                    j7Var2.d = true;
                                    j7Var2.f14302c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j7Var2.f14303e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j7Var2.f14303e.set(f11, tL_starGiftCollection3);
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
                final j7 j7Var2 = this.f14181b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        j7 j7Var22 = j7Var2;
                        switch (i10) {
                            case 0:
                                long j10 = j7Var22.f14301b;
                                int i11 = j7Var22.f14300a;
                                ArrayList arrayList = j7Var22.f14303e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j7Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l7 l7Var = new l7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l7Var.f14398c = true;
                                            l7Var.d = i13;
                                            j7Var22.h.put(Integer.valueOf(i13), l7Var);
                                        }
                                    }
                                    j7Var22.d = true;
                                    j7Var22.f14302c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j7Var22.j();
                                    j7Var22.d = true;
                                    j7Var22.f14302c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j7Var22.f14303e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j7Var22.f14303e.set(f11, tL_starGiftCollection3);
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
                final j7 j7Var3 = this.f14181b;
                j7Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        j7 j7Var22 = j7Var3;
                        switch (i10) {
                            case 0:
                                long j10 = j7Var22.f14301b;
                                int i11 = j7Var22.f14300a;
                                ArrayList arrayList = j7Var22.f14303e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    j7Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (j7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            l7 l7Var = new l7(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            l7Var.f14398c = true;
                                            l7Var.d = i13;
                                            j7Var22.h.put(Integer.valueOf(i13), l7Var);
                                        }
                                    }
                                    j7Var22.d = true;
                                    j7Var22.f14302c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    j7Var22.j();
                                    j7Var22.d = true;
                                    j7Var22.f14302c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), j7Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = j7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        j7Var22.f14303e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                j7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = j7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        j7Var22.f14303e.set(f11, tL_starGiftCollection3);
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
