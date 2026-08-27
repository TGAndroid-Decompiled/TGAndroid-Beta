package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

public final class i7 implements RequestDelegate {

    public final int f9490a;

    public final k7 f9491b;

    public i7(k7 k7Var, int i10) {
        this.f9490a = i10;
        this.f9491b = k7Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9490a) {
            case 0:
                final int i10 = 0;
                final k7 k7Var = this.f9491b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        k7 k7Var2 = k7Var;
                        switch (i11) {
                            case 0:
                                long j10 = k7Var2.f9612b;
                                int i12 = k7Var2.f9611a;
                                ArrayList arrayList = k7Var2.f9614e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k7Var2.j();
                                    int size = arrayList.size();
                                    int i13 = 0;
                                    while (i13 < size) {
                                        Object obj = arrayList.get(i13);
                                        i13++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k7Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            m7 m7Var = new m7(i12, j10, false);
                                            int i14 = tL_starGiftCollection.collection_id;
                                            m7Var.f9746c = true;
                                            m7Var.d = i14;
                                            k7Var2.h.put(Integer.valueOf(i14), m7Var);
                                        }
                                    }
                                    k7Var2.d = true;
                                    k7Var2.f9613c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var2);
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k7Var2.j();
                                    k7Var2.d = true;
                                    k7Var2.f9613c = false;
                                    NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var2);
                                }
                                break;
                            case 1:
                                k7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iF = k7Var2.f(tL_starGiftCollection2.collection_id);
                                    if (iF >= 0) {
                                        k7Var2.f9614e.set(iF, tL_starGiftCollection2);
                                    }
                                }
                                break;
                            default:
                                k7Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iF2 = k7Var2.f(tL_starGiftCollection3.collection_id);
                                    if (iF2 >= 0) {
                                        k7Var2.f9614e.set(iF2, tL_starGiftCollection3);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final k7 k7Var2 = this.f9491b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i11;
                        TLObject tLObject2 = tLObject;
                        k7 k7Var3 = k7Var2;
                        switch (i12) {
                            case 0:
                                long j10 = k7Var3.f9612b;
                                int i13 = k7Var3.f9611a;
                                ArrayList arrayList = k7Var3.f9614e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k7Var3.j();
                                    int size = arrayList.size();
                                    int i14 = 0;
                                    while (i14 < size) {
                                        Object obj = arrayList.get(i14);
                                        i14++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k7Var3.e(tL_starGiftCollection.collection_id) == null) {
                                            m7 m7Var = new m7(i13, j10, false);
                                            int i15 = tL_starGiftCollection.collection_id;
                                            m7Var.f9746c = true;
                                            m7Var.d = i15;
                                            k7Var3.h.put(Integer.valueOf(i15), m7Var);
                                        }
                                    }
                                    k7Var3.d = true;
                                    k7Var3.f9613c = false;
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var3);
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k7Var3.j();
                                    k7Var3.d = true;
                                    k7Var3.f9613c = false;
                                    NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var3);
                                }
                                break;
                            case 1:
                                k7Var3.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iF = k7Var3.f(tL_starGiftCollection2.collection_id);
                                    if (iF >= 0) {
                                        k7Var3.f9614e.set(iF, tL_starGiftCollection2);
                                    }
                                }
                                break;
                            default:
                                k7Var3.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iF2 = k7Var3.f(tL_starGiftCollection3.collection_id);
                                    if (iF2 >= 0) {
                                        k7Var3.f9614e.set(iF2, tL_starGiftCollection3);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final k7 k7Var3 = this.f9491b;
                k7Var3.getClass();
                final int i12 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i13 = i12;
                        TLObject tLObject2 = tLObject;
                        k7 k7Var4 = k7Var3;
                        switch (i13) {
                            case 0:
                                long j10 = k7Var4.f9612b;
                                int i14 = k7Var4.f9611a;
                                ArrayList arrayList = k7Var4.f9614e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k7Var4.j();
                                    int size = arrayList.size();
                                    int i15 = 0;
                                    while (i15 < size) {
                                        Object obj = arrayList.get(i15);
                                        i15++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k7Var4.e(tL_starGiftCollection.collection_id) == null) {
                                            m7 m7Var = new m7(i14, j10, false);
                                            int i16 = tL_starGiftCollection.collection_id;
                                            m7Var.f9746c = true;
                                            m7Var.d = i16;
                                            k7Var4.h.put(Integer.valueOf(i16), m7Var);
                                        }
                                    }
                                    k7Var4.d = true;
                                    k7Var4.f9613c = false;
                                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var4);
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k7Var4.j();
                                    k7Var4.d = true;
                                    k7Var4.f9613c = false;
                                    NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j10), k7Var4);
                                }
                                break;
                            case 1:
                                k7Var4.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iF = k7Var4.f(tL_starGiftCollection2.collection_id);
                                    if (iF >= 0) {
                                        k7Var4.f9614e.set(iF, tL_starGiftCollection2);
                                    }
                                }
                                break;
                            default:
                                k7Var4.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int iF2 = k7Var4.f(tL_starGiftCollection3.collection_id);
                                    if (iF2 >= 0) {
                                        k7Var4.f9614e.set(iF2, tL_starGiftCollection3);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
