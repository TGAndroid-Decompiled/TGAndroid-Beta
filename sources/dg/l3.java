package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import lh.i4;
import lh.j7;
import lh.k4;
import lh.t7;
import lh.z9;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.dn0;
import org.telegram.ui.fn0;
import org.telegram.ui.yf0;
import org.telegram.ui.zq0;
public final class l3 implements OnFailureListener, Utilities.Callback2Return, org.telegram.ui.ActionBar.c2, vc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f4658a;
    public final int f4659b;
    public final Object f4660c;
    public final Object d;
    public final Object e;
    public final Object f4661f;

    public l3(int i10, xc0 xc0Var, org.telegram.ui.Components.y3 y3Var, org.telegram.ui.Components.z3 z3Var, TextView textView) {
        this.f4658a = 3;
        this.f4659b = i10;
        this.f4660c = xc0Var;
        this.d = y3Var;
        this.e = z3Var;
        this.f4661f = textView;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        lf.a aVar;
        switch (this.f4658a) {
            case 2:
                k4 k4Var = (k4) this.f4660c;
                Context context = (Context) this.d;
                f6 f6Var = (f6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f4661f;
                i4 i4Var = (i4) k4Var.f12699o.get(k4Var.f12701q);
                if (i4Var != null) {
                    lf.a aVar2 = i4Var.f12571c;
                    t7 x10 = t7.x(this.f4659b, k4Var.f12701q);
                    if (x10.e) {
                        aVar = lf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f12055b > aVar.f12055b) {
                        lf.b bVar = k4Var.f12701q;
                        if (bVar == lf.b.f12056a) {
                            new z9(context, f6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == lf.b.f12057b) {
                            new qh.f(context, f6Var, i4Var.f12571c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    ze.c cVar = k4Var.f12698n;
                    if (cVar != null) {
                        cVar.a(false);
                        k4Var.f12698n = null;
                    }
                    callback2.run(i4Var, d2Var.g(i10, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.d;
                dn0 dn0Var = (dn0) this.e;
                fn0.Z(this.f4659b, (String) this.f4661f, secureDocument, dn0Var, (fn0) this.f4660c);
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        q3 q3Var = (q3) this.f4660c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f4659b;
        zq0 zq0Var = (zq0) this.e;
        j3 j3Var = (j3) this.f4661f;
        q3Var.f4765x = false;
        FileLog.e(exc);
        if ((exc instanceof ya.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && q3Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new cg.v1(q3Var, bitmap, i10, zq0Var, 1), 2000L);
        } else {
            j3Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new kh.l2((yf0) this.f4660c, (String) this.d, hVar, list, (String) this.e, (String) this.f4661f, this.f4659b));
    }

    @Override
    public void q(xc0 xc0Var, int i10) {
        xc0 xc0Var2 = (xc0) this.f4660c;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.d;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.e;
        z4.g(null, null, 0L, this.f4659b, 3, xc0Var2, y3Var, z3Var);
        z4.e((TextView) this.f4661f, xc0Var2, y3Var, z3Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        qy0 qy0Var = (qy0) this.f4660c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f4661f;
        if (this.f4659b != qy0Var.F) {
            return;
        }
        qy0Var.D = 1;
        qy0Var.E = str2;
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
            qy0Var.f28326x = false;
            qy0Var.v = false;
            qy0Var.c();
            u2 u2Var = qy0Var.d;
            if (u2Var != null) {
                u2Var.setVisibility(0);
            }
            qy0Var.R = AndroidUtilities.dp(10.0f);
            qy0Var.f28325w = arrayList;
            qy0Var.S = 0;
            qy0Var.T = Integer.valueOf(str2.length());
            u2 u2Var2 = qy0Var.d;
            if (u2Var2 != null) {
                u2Var2.invalidate();
            }
            ny0 ny0Var = qy0Var.f28321f;
            if (ny0Var != null) {
                ny0Var.l();
                return;
            }
            return;
        }
        qy0Var.f28325w = null;
        qy0Var.f28326x = true;
        qy0Var.f();
    }

    public l3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f4658a = i11;
        this.f4660c = obj;
        this.f4659b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f4661f = obj4;
    }

    public l3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f4658a = i11;
        this.f4660c = notificationCenterDelegate;
        this.d = obj;
        this.f4659b = i10;
        this.e = obj2;
        this.f4661f = obj3;
    }

    public l3(yf0 yf0Var, String str, String str2, String str3, int i10) {
        this.f4658a = 5;
        this.f4660c = yf0Var;
        this.d = str;
        this.e = str2;
        this.f4661f = str3;
        this.f4659b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        or0 or0Var = (or0) this.f4660c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        Context context = (Context) this.e;
        f6 f6Var = (f6) this.f4661f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        j7 j7Var = or0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !or0Var.I) {
            int i11 = 0;
            while (true) {
                if (i11 >= j7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) j7Var.d().get(i11)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) j7Var.d().get(i11);
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            int i12 = this.f4659b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(or0Var.f11017c));
            boolean h = j7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            p70 H = p70.H(p2Var, view);
            H.W(new kh.s2(or0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new kh.k2(or0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new kh.l2(or0Var, i12, publicUsername, tL_starGiftCollection, context, f6Var, p2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new ff.c(23, or0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new kh.k2(or0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new ah.a(or0Var, i10, tL_starGiftCollection, 6));
            or0Var.F = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
