package ai;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class t9 implements RequestDelegate {
    public final int f2222a;
    public final v9 f2223b;

    public t9(v9 v9Var, int i10) {
        this.f2222a = i10;
        this.f2223b = v9Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2222a) {
            case 0:
                final v9 v9Var = this.f2223b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        v9 v9Var2 = v9Var;
                        switch (i10) {
                            case 0:
                                long j10 = v9Var2.f2320b;
                                int i11 = v9Var2.f2319a;
                                ArrayList arrayList = v9Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    v9Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (v9Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            y9 y9Var = new y9(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            y9Var.f2505c = true;
                                            y9Var.d = i13;
                                            v9Var2.h.put(Integer.valueOf(i13), y9Var);
                                        }
                                    }
                                    v9Var2.d = true;
                                    v9Var2.f2321c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    v9Var2.j();
                                    v9Var2.d = true;
                                    v9Var2.f2321c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                v9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = v9Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        v9Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                v9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = v9Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        v9Var2.e.set(f10, tL_starGiftCollection3);
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
                final v9 v9Var2 = this.f2223b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        v9 v9Var22 = v9Var2;
                        switch (i10) {
                            case 0:
                                long j10 = v9Var22.f2320b;
                                int i11 = v9Var22.f2319a;
                                ArrayList arrayList = v9Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    v9Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (v9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            y9 y9Var = new y9(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            y9Var.f2505c = true;
                                            y9Var.d = i13;
                                            v9Var22.h.put(Integer.valueOf(i13), y9Var);
                                        }
                                    }
                                    v9Var22.d = true;
                                    v9Var22.f2321c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    v9Var22.j();
                                    v9Var22.d = true;
                                    v9Var22.f2321c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = v9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        v9Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = v9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        v9Var22.e.set(f10, tL_starGiftCollection3);
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
                final v9 v9Var3 = this.f2223b;
                v9Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        v9 v9Var22 = v9Var3;
                        switch (i10) {
                            case 0:
                                long j10 = v9Var22.f2320b;
                                int i11 = v9Var22.f2319a;
                                ArrayList arrayList = v9Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    v9Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (v9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            y9 y9Var = new y9(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            y9Var.f2505c = true;
                                            y9Var.d = i13;
                                            v9Var22.h.put(Integer.valueOf(i13), y9Var);
                                        }
                                    }
                                    v9Var22.d = true;
                                    v9Var22.f2321c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    v9Var22.j();
                                    v9Var22.d = true;
                                    v9Var22.f2321c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), v9Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = v9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        v9Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                v9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = v9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        v9Var22.e.set(f10, tL_starGiftCollection3);
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
