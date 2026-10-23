package ai;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cz0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.mf0;
import org.telegram.ui.tm0;
import org.telegram.ui.vm0;
import org.telegram.ui.wq0;
public final class j6 implements org.telegram.ui.ActionBar.a2, md0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final int f1568a;
    public final int f1569b;
    public final Object f1570c;
    public final Object d;
    public final Object e;
    public final Object f1571f;

    public j6(int i10, od0 od0Var, org.telegram.ui.Components.e4 e4Var, org.telegram.ui.Components.f4 f4Var, TextView textView) {
        this.f1568a = 1;
        this.f1569b = i10;
        this.f1570c = od0Var;
        this.d = e4Var;
        this.e = f4Var;
        this.f1571f = textView;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ag.a aVar;
        switch (this.f1568a) {
            case 0:
                l6 l6Var = (l6) this.f1570c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f1571f;
                i6 i6Var = (i6) l6Var.f1714o.get(l6Var.f1716q);
                if (i6Var != null) {
                    ag.a aVar2 = i6Var.f1491c;
                    ga x10 = ga.x(this.f1569b, l6Var.f1716q);
                    if (x10.e) {
                        aVar = ag.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f632b > aVar.f632b) {
                        ag.b bVar = l6Var.f1716q;
                        if (bVar == ag.b.f633a) {
                            new cd(context, d6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == ag.b.f634b) {
                            new fi.f(context, d6Var, i6Var.f1491c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    pf.c cVar = l6Var.f1713n;
                    if (cVar != null) {
                        cVar.a(false);
                        l6Var.f1713n = null;
                    }
                    callback2.run(i6Var, b2Var.h(i10, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.d;
                tm0 tm0Var = (tm0) this.e;
                vm0.Z(this.f1569b, (String) this.f1571f, secureDocument, tm0Var, (vm0) this.f1570c);
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        rg.n2 n2Var = (rg.n2) this.f1570c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f1569b;
        wq0 wq0Var = (wq0) this.e;
        gi.g4 g4Var = (gi.g4) this.f1571f;
        n2Var.f45553x = false;
        FileLog.e(exc);
        if ((exc instanceof nb.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new cz0(n2Var, bitmap, i10, wq0Var, 20), 2000L);
        } else {
            g4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(c5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new hg.d1((mf0) this.f1570c, (String) this.d, iVar, list, (String) this.e, (String) this.f1571f, this.f1569b));
    }

    @Override
    public void q(od0 od0Var, int i10) {
        od0 od0Var2 = (od0) this.f1570c;
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.d;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.e;
        org.telegram.ui.Components.f5.f(null, null, 0L, this.f1569b, 3, od0Var2, e4Var, f4Var);
        org.telegram.ui.Components.f5.d((TextView) this.f1571f, od0Var2, e4Var, f4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        iz0 iz0Var = (iz0) this.f1570c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f1571f;
        if (this.f1569b != iz0Var.I) {
            return;
        }
        iz0Var.G = 1;
        iz0Var.H = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                if (!hashSet.contains(keywordResult.emoji)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            iz0Var.f27369x = false;
            iz0Var.v = false;
            iz0Var.c();
            ah.x xVar = iz0Var.d;
            if (xVar != null) {
                xVar.setVisibility(0);
            }
            iz0Var.U = AndroidUtilities.dp(10.0f);
            iz0Var.f27368w = arrayList;
            iz0Var.V = 0;
            iz0Var.W = Integer.valueOf(str2.length());
            ah.x xVar2 = iz0Var.d;
            if (xVar2 != null) {
                xVar2.invalidate();
            }
            fz0 fz0Var = iz0Var.f27364f;
            if (fz0Var != null) {
                fz0Var.l();
                return;
            }
            return;
        }
        iz0Var.f27368w = null;
        iz0Var.f27369x = true;
        iz0Var.f();
    }

    public j6(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f1568a = i11;
        this.f1570c = obj;
        this.f1569b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f1571f = obj4;
    }

    public j6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1568a = i11;
        this.f1570c = notificationCenterDelegate;
        this.d = obj;
        this.f1569b = i10;
        this.e = obj2;
        this.f1571f = obj3;
    }

    public j6(ks0 ks0Var, int i10, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f1568a = 6;
        this.f1570c = ks0Var;
        this.f1569b = i10;
        this.f1571f = n2Var;
        this.d = context;
        this.e = d6Var;
    }

    public j6(mf0 mf0Var, String str, String str2, String str3, int i10) {
        this.f1568a = 3;
        this.f1570c = mf0Var;
        this.d = str;
        this.e = str2;
        this.f1571f = str3;
        this.f1569b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        ks0 ks0Var = (ks0) this.f1570c;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f1571f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        v9 v9Var = ks0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !ks0Var.L) {
            int i10 = 0;
            while (true) {
                if (i10 >= v9Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) v9Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) v9Var.d().get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.f1569b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(ks0Var.f50469c));
            boolean h = v9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            i80 H = i80.H(n2Var, view);
            H.W(new ns0(ks0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new yh.q1(ks0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new hg.d1(ks0Var, i12, publicUsername, tL_starGiftCollection2, context, d6Var, n2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new u2.j0(20, ks0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new yh.q1(ks0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new y31(ks0Var, i11, tL_starGiftCollection2, 26));
            ks0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
