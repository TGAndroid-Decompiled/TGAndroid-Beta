package gh;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import hh.ea;
import hh.k7;
import hh.u7;
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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.nq0;
import org.telegram.ui.rf0;
import org.telegram.ui.vm0;
import org.telegram.ui.xm0;
import org.telegram.ui.xs;

public final class u2 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.a2, dc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener {

    public final int f7550a;

    public final int f7551b;

    public final Object f7552c;
    public final Object d;

    public final Object f7553e;

    public final Object f7554f;

    public u2(int i10, fc0 fc0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.f7550a = 2;
        this.f7551b = i10;
        this.f7553e = fc0Var;
        this.f7554f = x3Var;
        this.f7552c = y3Var;
        this.d = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f7550a) {
            case 1:
                hh.m4 m4Var = (hh.m4) this.f7553e;
                Context context = (Context) this.f7552c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f7554f;
                hh.k4 k4Var = (hh.k4) m4Var.f9726o.get(m4Var.f9728q);
                if (k4Var != null) {
                    hf.a aVar = k4Var.f9580c;
                    u7 u7VarX = u7.x(this.f7551b, m4Var.f9728q);
                    hf.a aVarL = u7VarX.f10154e ? hf.a.l(u7VarX.p()) : null;
                    if (aVarL != null && aVar.f8920b > aVarL.f8920b) {
                        hf.b bVar = m4Var.f9728q;
                        if (bVar == hf.b.f8921a) {
                            new ea(context, c6Var, aVar.a(), 14, null, null, 0L).show();
                        } else if (bVar == hf.b.f8922b) {
                            new mh.f(context, c6Var, k4Var.f9580c, true, null).show();
                        }
                    } else {
                        we.d dVar = m4Var.f9725n;
                        if (dVar != null) {
                            dVar.a(false);
                            m4Var.f9725n = null;
                        }
                        callback2.run(k4Var, b2Var.g(i10, true, true));
                    }
                    break;
                }
                break;
            default:
                xm0 xm0Var = (xm0) this.f7553e;
                xm0.Z(this.f7551b, (String) this.d, (SecureDocument) this.f7554f, (vm0) this.f7552c, xm0Var);
                break;
        }
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        fc0 fc0Var2 = (fc0) this.f7553e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f7554f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.f7552c;
        TextView textView = (TextView) this.d;
        org.telegram.ui.Components.y4.g(null, null, 0L, this.f7551b, 3, fc0Var2, x3Var, y3Var);
        org.telegram.ui.Components.y4.e(textView, fc0Var2, x3Var, y3Var);
    }

    @Override
    public void onFailure(Exception exc) {
        zf.n2 n2Var = (zf.n2) this.f7553e;
        Bitmap bitmap = (Bitmap) this.f7554f;
        int i10 = this.f7551b;
        nq0 nq0Var = (nq0) this.f7552c;
        q2 q2Var = (q2) this.d;
        n2Var.f50629x = false;
        FileLog.e(exc);
        if ((exc instanceof va.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && n2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new xs(n2Var, bitmap, i10, nq0Var, 16), 2000L);
        } else {
            q2Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new p2((rf0) this.f7553e, (String) this.f7554f, gVar, list, (String) this.f7552c, (String) this.d, this.f7551b));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        wx0 wx0Var = (wx0) this.f7553e;
        String str2 = (String) this.f7554f;
        HashSet hashSet = (HashSet) this.f7552c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f7551b != wx0Var.E) {
            return;
        }
        wx0Var.C = 1;
        wx0Var.D = str2;
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
        if (arrayList2.isEmpty()) {
            wx0Var.f34371w = null;
            wx0Var.f34372x = true;
            wx0Var.f();
            return;
        }
        wx0Var.f34372x = false;
        wx0Var.v = false;
        wx0Var.c();
        ag.p1 p1Var = wx0Var.d;
        if (p1Var != null) {
            p1Var.setVisibility(0);
        }
        wx0Var.Q = AndroidUtilities.dp(10.0f);
        wx0Var.f34371w = arrayList;
        wx0Var.R = 0;
        wx0Var.S = Integer.valueOf(str2.length());
        ag.p1 p1Var2 = wx0Var.d;
        if (p1Var2 != null) {
            p1Var2.invalidate();
        }
        tx0 tx0Var = wx0Var.f34367f;
        if (tx0Var != null) {
            tx0Var.l();
        }
    }

    public u2(FrameLayout frameLayout, int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.f7550a = i11;
        this.f7553e = frameLayout;
        this.f7551b = i10;
        this.f7554f = obj;
        this.f7552c = obj2;
        this.d = obj3;
    }

    public u2(hh.m4 m4Var, int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Utilities.Callback2 callback2) {
        this.f7550a = 1;
        this.f7553e = m4Var;
        this.f7551b = i10;
        this.f7552c = context;
        this.d = c6Var;
        this.f7554f = callback2;
    }

    public u2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f7550a = i11;
        this.f7553e = notificationCenterDelegate;
        this.f7554f = obj;
        this.f7551b = i10;
        this.f7552c = obj2;
        this.d = obj3;
    }

    public u2(rf0 rf0Var, String str, String str2, String str3, int i10) {
        this.f7550a = 4;
        this.f7553e = rf0Var;
        this.f7554f = str;
        this.f7552c = str2;
        this.d = str3;
        this.f7551b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        wq0 wq0Var = (wq0) this.f7553e;
        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.f7554f;
        Context context = (Context) this.f7552c;
        org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        k7 k7Var = wq0Var.f7200e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !wq0Var.H) {
            int i11 = 0;
            while (true) {
                if (i11 >= k7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                }
                if (((TL_stars.TL_starGiftCollection) k7Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) k7Var.d().get(i11);
                    i10 = i11;
                    break;
                }
                i11++;
            }
            int i12 = this.f7551b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(wq0Var.f7199c));
            boolean zH = k7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !zH) {
                return Boolean.FALSE;
            }
            b70 b70VarH = b70.H(n2Var, view);
            b70VarH.W(new z2(wq0Var));
            b70VarH.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new o2(wq0Var, 0), zH);
            b70VarH.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new p2(wq0Var, i12, publicUsername, tL_starGiftCollection, context, c6Var, n2Var, 0), !TextUtils.isEmpty(publicUsername));
            b70VarH.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new d5.u(13, wq0Var, tL_starGiftCollection), zH);
            b70VarH.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new o2(wq0Var, 1), zH);
            b70VarH.m(zH, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new d5.i(wq0Var, i10, tL_starGiftCollection, 2));
            wq0Var.E = b70VarH;
            b70VarH.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
