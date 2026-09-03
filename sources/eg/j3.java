package eg;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import mh.i4;
import mh.j7;
import mh.k4;
import mh.t7;
import mh.z9;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.dn0;
import org.telegram.ui.fn0;
import org.telegram.ui.xf0;
import org.telegram.ui.zq0;
public final class j3 implements OnFailureListener, Utilities.Callback2Return, org.telegram.ui.ActionBar.c2, wc0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy {
    public final int f5308a;
    public final int f5309b;
    public final Object f5310c;
    public final Object d;
    public final Object f5311e;
    public final Object f5312f;

    public j3(int i10, yc0 yc0Var, org.telegram.ui.Components.y3 y3Var, org.telegram.ui.Components.z3 z3Var, TextView textView) {
        this.f5308a = 3;
        this.f5309b = i10;
        this.f5310c = yc0Var;
        this.d = y3Var;
        this.f5311e = z3Var;
        this.f5312f = textView;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        mf.a aVar;
        switch (this.f5308a) {
            case 2:
                k4 k4Var = (k4) this.f5310c;
                Context context = (Context) this.d;
                g6 g6Var = (g6) this.f5311e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f5312f;
                i4 i4Var = (i4) k4Var.f14347o.get(k4Var.f14349q);
                if (i4Var != null) {
                    mf.a aVar2 = i4Var.f14235c;
                    t7 x10 = t7.x(this.f5309b, k4Var.f14349q);
                    if (x10.f14833e) {
                        aVar = mf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f13652b > aVar.f13652b) {
                        mf.b bVar = k4Var.f14349q;
                        if (bVar == mf.b.f13653a) {
                            new z9(context, g6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == mf.b.f13654b) {
                            new rh.f(context, g6Var, i4Var.f14235c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    af.f fVar = k4Var.f14346n;
                    if (fVar != null) {
                        fVar.a(false);
                        k4Var.f14346n = null;
                    }
                    callback2.run(i4Var, d2Var.g(i10, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.d;
                dn0 dn0Var = (dn0) this.f5311e;
                fn0.Z(this.f5309b, (String) this.f5312f, secureDocument, dn0Var, (fn0) this.f5310c);
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        o3 o3Var = (o3) this.f5310c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f5309b;
        zq0 zq0Var = (zq0) this.f5311e;
        h3 h3Var = (h3) this.f5312f;
        o3Var.f5422x = false;
        FileLog.e(exc);
        if ((exc instanceof ya.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && o3Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new dg.u1(o3Var, bitmap, i10, zq0Var, 2), 2000L);
        } else {
            h3Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        AndroidUtilities.runOnUIThread(new lh.l2((xf0) this.f5310c, (String) this.d, hVar, list, (String) this.f5311e, (String) this.f5312f, this.f5309b));
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        yc0 yc0Var2 = (yc0) this.f5310c;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.d;
        org.telegram.ui.Components.z3 z3Var = (org.telegram.ui.Components.z3) this.f5311e;
        z4.g(null, null, 0L, this.f5309b, 3, yc0Var2, y3Var, z3Var);
        z4.e((TextView) this.f5312f, yc0Var2, y3Var, z3Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        qy0 qy0Var = (qy0) this.f5310c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.f5311e;
        ArrayList arrayList2 = (ArrayList) this.f5312f;
        if (this.f5309b != qy0Var.F) {
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
            qy0Var.f30568x = false;
            qy0Var.v = false;
            qy0Var.c();
            s2 s2Var = qy0Var.d;
            if (s2Var != null) {
                s2Var.setVisibility(0);
            }
            qy0Var.R = AndroidUtilities.dp(10.0f);
            qy0Var.f30567w = arrayList;
            qy0Var.S = 0;
            qy0Var.T = Integer.valueOf(str2.length());
            s2 s2Var2 = qy0Var.d;
            if (s2Var2 != null) {
                s2Var2.invalidate();
            }
            ny0 ny0Var = qy0Var.f30563f;
            if (ny0Var != null) {
                ny0Var.l();
                return;
            }
            return;
        }
        qy0Var.f30567w = null;
        qy0Var.f30568x = true;
        qy0Var.f();
    }

    public j3(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f5308a = i11;
        this.f5310c = obj;
        this.f5309b = i10;
        this.d = obj2;
        this.f5311e = obj3;
        this.f5312f = obj4;
    }

    public j3(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f5308a = i11;
        this.f5310c = notificationCenterDelegate;
        this.d = obj;
        this.f5309b = i10;
        this.f5311e = obj2;
        this.f5312f = obj3;
    }

    public j3(xf0 xf0Var, String str, String str2, String str3, int i10) {
        this.f5308a = 5;
        this.f5310c = xf0Var;
        this.d = str;
        this.f5311e = str2;
        this.f5312f = str3;
        this.f5309b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i10;
        or0 or0Var = (or0) this.f5310c;
        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
        Context context = (Context) this.f5311e;
        g6 g6Var = (g6) this.f5312f;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        j7 j7Var = or0Var.f13103e;
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
            int i12 = this.f5309b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(or0Var.f13102c));
            boolean h = j7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            q70 H = q70.H(p2Var, view);
            H.W(new lh.s2(or0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new lh.k2(or0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new lh.l2(or0Var, i12, publicUsername, tL_starGiftCollection, context, g6Var, p2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new gf.c(25, or0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new lh.k2(or0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new bh.a(or0Var, i10, tL_starGiftCollection, 6));
            or0Var.F = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
