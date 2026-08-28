package gh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class j7 implements RequestDelegate {
    public final int f8351a;
    public final l7 f8352b;

    public j7(l7 l7Var, int i9) {
        this.f8351a = i9;
        this.f8352b = l7Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8351a) {
            case 0:
                final l7 l7Var = this.f8352b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9 = r3;
                        TLObject tLObject2 = tLObject;
                        l7 l7Var2 = l7Var;
                        switch (i9) {
                            case 0:
                                long j10 = l7Var2.f8502b;
                                int i10 = l7Var2.f8501a;
                                ArrayList arrayList = l7Var2.f8504e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l7Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            n7 n7Var = new n7(i10, j10, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            n7Var.f8618c = true;
                                            n7Var.d = i12;
                                            l7Var2.h.put(Integer.valueOf(i12), n7Var);
                                        }
                                    }
                                    l7Var2.d = true;
                                    l7Var2.f8503c = false;
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    l7Var2.j();
                                    l7Var2.d = true;
                                    l7Var2.f8503c = false;
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                l7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        l7Var2.f8504e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                l7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = l7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        l7Var2.f8504e.set(f11, tL_starGiftCollection3);
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
                final l7 l7Var2 = this.f8352b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9 = r3;
                        TLObject tLObject2 = tLObject;
                        l7 l7Var22 = l7Var2;
                        switch (i9) {
                            case 0:
                                long j10 = l7Var22.f8502b;
                                int i10 = l7Var22.f8501a;
                                ArrayList arrayList = l7Var22.f8504e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l7Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n7 n7Var = new n7(i10, j10, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            n7Var.f8618c = true;
                                            n7Var.d = i12;
                                            l7Var22.h.put(Integer.valueOf(i12), n7Var);
                                        }
                                    }
                                    l7Var22.d = true;
                                    l7Var22.f8503c = false;
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    l7Var22.j();
                                    l7Var22.d = true;
                                    l7Var22.f8503c = false;
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        l7Var22.f8504e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = l7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        l7Var22.f8504e.set(f11, tL_starGiftCollection3);
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
                final l7 l7Var3 = this.f8352b;
                l7Var3.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i9 = r3;
                        TLObject tLObject2 = tLObject;
                        l7 l7Var22 = l7Var3;
                        switch (i9) {
                            case 0:
                                long j10 = l7Var22.f8502b;
                                int i10 = l7Var22.f8501a;
                                ArrayList arrayList = l7Var22.f8504e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    l7Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (l7Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            n7 n7Var = new n7(i10, j10, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            n7Var.f8618c = true;
                                            n7Var.d = i12;
                                            l7Var22.h.put(Integer.valueOf(i12), n7Var);
                                        }
                                    }
                                    l7Var22.d = true;
                                    l7Var22.f8503c = false;
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    l7Var22.j();
                                    l7Var22.d = true;
                                    l7Var22.f8503c = false;
                                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), l7Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = l7Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        l7Var22.f8504e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                l7Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = l7Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        l7Var22.f8504e.set(f11, tL_starGiftCollection3);
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
