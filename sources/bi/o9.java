package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class o9 implements RequestDelegate {
    public final int f5204a;
    public final q9 f5205b;

    public o9(q9 q9Var, int i10) {
        this.f5204a = i10;
        this.f5205b = q9Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f5204a) {
            case 0:
                final q9 q9Var = this.f5205b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        q9 q9Var2 = q9Var;
                        switch (i10) {
                            case 0:
                                long j10 = q9Var2.f5292b;
                                int i11 = q9Var2.f5291a;
                                ArrayList arrayList = q9Var2.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    q9Var2.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (q9Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            t9 t9Var = new t9(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            t9Var.f5465c = true;
                                            t9Var.d = i13;
                                            q9Var2.h.put(Integer.valueOf(i13), t9Var);
                                        }
                                    }
                                    q9Var2.d = true;
                                    q9Var2.f5293c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    q9Var2.j();
                                    q9Var2.d = true;
                                    q9Var2.f5293c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                q9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = q9Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        q9Var2.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q9Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = q9Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        q9Var2.e.set(f10, tL_starGiftCollection3);
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
                final q9 q9Var2 = this.f5205b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        q9 q9Var22 = q9Var2;
                        switch (i10) {
                            case 0:
                                long j10 = q9Var22.f5292b;
                                int i11 = q9Var22.f5291a;
                                ArrayList arrayList = q9Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    q9Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (q9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            t9 t9Var = new t9(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            t9Var.f5465c = true;
                                            t9Var.d = i13;
                                            q9Var22.h.put(Integer.valueOf(i13), t9Var);
                                        }
                                    }
                                    q9Var22.d = true;
                                    q9Var22.f5293c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    q9Var22.j();
                                    q9Var22.d = true;
                                    q9Var22.f5293c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = q9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        q9Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = q9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        q9Var22.e.set(f10, tL_starGiftCollection3);
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
                final q9 q9Var3 = this.f5205b;
                q9Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        q9 q9Var22 = q9Var3;
                        switch (i10) {
                            case 0:
                                long j10 = q9Var22.f5292b;
                                int i11 = q9Var22.f5291a;
                                ArrayList arrayList = q9Var22.e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    q9Var22.j();
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    while (i12 < size) {
                                        Object obj = arrayList.get(i12);
                                        i12++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (q9Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            t9 t9Var = new t9(i11, j10, false);
                                            int i13 = tL_starGiftCollection.collection_id;
                                            t9Var.f5465c = true;
                                            t9Var.d = i13;
                                            q9Var22.h.put(Integer.valueOf(i13), t9Var);
                                        }
                                    }
                                    q9Var22.d = true;
                                    q9Var22.f5293c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    q9Var22.j();
                                    q9Var22.d = true;
                                    q9Var22.f5293c = false;
                                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), q9Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f7 = q9Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f7 >= 0) {
                                        q9Var22.e.set(f7, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                q9Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = q9Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f10 >= 0) {
                                        q9Var22.e.set(f10, tL_starGiftCollection3);
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
