package fh;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import gh.ea;
import gh.l7;
import gh.v7;
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
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.mq0;
import org.telegram.ui.of0;
import org.telegram.ui.um0;
import org.telegram.ui.wm0;
public final class z2 implements Utilities.Callback2Return, org.telegram.ui.ActionBar.b2, zb0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener {
    public final int f6907a;
    public final int f6908b;
    public final Object f6909c;
    public final Object d;
    public final Object f6910e;
    public final Object f6911f;

    public z2(int i9, bc0 bc0Var, org.telegram.ui.Components.x3 x3Var, org.telegram.ui.Components.y3 y3Var, TextView textView) {
        this.f6907a = 2;
        this.f6908b = i9;
        this.f6910e = bc0Var;
        this.f6911f = x3Var;
        this.f6909c = y3Var;
        this.d = textView;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        gf.a aVar;
        switch (this.f6907a) {
            case 1:
                gh.o4 o4Var = (gh.o4) this.f6910e;
                Context context = (Context) this.f6909c;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f6911f;
                gh.m4 m4Var = (gh.m4) o4Var.f8680o.get(o4Var.f8682q);
                if (m4Var != null) {
                    gf.a aVar2 = m4Var.f8545c;
                    v7 x10 = v7.x(this.f6908b, o4Var.f8682q);
                    if (x10.f9048e) {
                        aVar = gf.a.l(x10.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f7748b > aVar.f7748b) {
                        gf.b bVar = o4Var.f8682q;
                        if (bVar == gf.b.f7749a) {
                            new ea(context, b6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == gf.b.f7750b) {
                            new lh.f(context, b6Var, m4Var.f8545c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    ve.d dVar = o4Var.f8679n;
                    if (dVar != null) {
                        dVar.a(false);
                        o4Var.f8679n = null;
                    }
                    callback2.run(m4Var, c2Var.g(i9, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.f6911f;
                um0 um0Var = (um0) this.f6909c;
                wm0.Y(this.f6908b, (String) this.d, secureDocument, um0Var, (wm0) this.f6910e);
                return;
        }
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        bc0 bc0Var2 = (bc0) this.f6910e;
        org.telegram.ui.Components.x3 x3Var = (org.telegram.ui.Components.x3) this.f6911f;
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.f6909c;
        org.telegram.ui.Components.y4.g(null, null, 0L, this.f6908b, 3, bc0Var2, x3Var, y3Var);
        org.telegram.ui.Components.y4.e((TextView) this.d, bc0Var2, x3Var, y3Var);
    }

    @Override
    public void onFailure(Exception exc) {
        yf.m2 m2Var = (yf.m2) this.f6910e;
        Bitmap bitmap = (Bitmap) this.f6911f;
        int i9 = this.f6908b;
        mq0 mq0Var = (mq0) this.f6909c;
        v2 v2Var = (v2) this.d;
        m2Var.f50003x = false;
        FileLog.e(exc);
        if ((exc instanceof ua.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && m2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new y01(m2Var, bitmap, i9, mq0Var), 2000L);
        } else {
            v2Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        AndroidUtilities.runOnUIThread(new u2((of0) this.f6910e, (String) this.f6911f, gVar, list, (String) this.f6909c, (String) this.d, this.f6908b));
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ux0 ux0Var = (ux0) this.f6910e;
        String str2 = (String) this.f6911f;
        HashSet hashSet = (HashSet) this.f6909c;
        ArrayList arrayList2 = (ArrayList) this.d;
        if (this.f6908b != ux0Var.E) {
            return;
        }
        ux0Var.C = 1;
        ux0Var.D = str2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                MediaDataController.KeywordResult keywordResult = (MediaDataController.KeywordResult) obj;
                if (!hashSet.contains(keywordResult.emoji)) {
                    hashSet.add(keywordResult.emoji);
                    arrayList2.add(keywordResult);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            ux0Var.f33167x = false;
            ux0Var.v = false;
            ux0Var.c();
            d2 d2Var = ux0Var.d;
            if (d2Var != null) {
                d2Var.setVisibility(0);
            }
            ux0Var.Q = AndroidUtilities.dp(10.0f);
            ux0Var.f33166w = arrayList;
            ux0Var.R = 0;
            ux0Var.S = Integer.valueOf(str2.length());
            d2 d2Var2 = ux0Var.d;
            if (d2Var2 != null) {
                d2Var2.invalidate();
            }
            rx0 rx0Var = ux0Var.f33162f;
            if (rx0Var != null) {
                rx0Var.l();
                return;
            }
            return;
        }
        ux0Var.f33166w = null;
        ux0Var.f33167x = true;
        ux0Var.f();
    }

    public z2(FrameLayout frameLayout, int i9, Object obj, Object obj2, Object obj3, int i10) {
        this.f6907a = i10;
        this.f6910e = frameLayout;
        this.f6908b = i9;
        this.f6911f = obj;
        this.f6909c = obj2;
        this.d = obj3;
    }

    public z2(gh.o4 o4Var, int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, Utilities.Callback2 callback2) {
        this.f6907a = 1;
        this.f6910e = o4Var;
        this.f6908b = i9;
        this.f6909c = context;
        this.d = b6Var;
        this.f6911f = callback2;
    }

    public z2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f6907a = i10;
        this.f6910e = notificationCenterDelegate;
        this.f6911f = obj;
        this.f6908b = i9;
        this.f6909c = obj2;
        this.d = obj3;
    }

    public z2(of0 of0Var, String str, String str2, String str3, int i9) {
        this.f6907a = 4;
        this.f6910e = of0Var;
        this.f6911f = str;
        this.f6909c = str2;
        this.d = str3;
        this.f6908b = i9;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        int i9;
        vq0 vq0Var = (vq0) this.f6910e;
        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f6911f;
        Context context = (Context) this.f6909c;
        org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.d;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        l7 l7Var = vq0Var.f6548e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !vq0Var.H) {
            int i10 = 0;
            while (true) {
                if (i10 >= l7Var.d().size()) {
                    tL_starGiftCollection = null;
                    i9 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) l7Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) l7Var.d().get(i10);
                    i9 = i10;
                    break;
                } else {
                    i10++;
                }
            }
            int i11 = this.f6908b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i11).getUserOrChat(vq0Var.f6547c));
            boolean h = l7Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            x60 H = x60.H(o2Var, view);
            H.W(new e3(vq0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new t2(vq0Var, 0), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new u2(vq0Var, i11, publicUsername, tL_starGiftCollection, context, b6Var, o2Var, 0), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new e5.u(7, vq0Var, tL_starGiftCollection), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new t2(vq0Var, 1), h);
            H.m(h, R.drawable.msg_delete, LocaleController.getString(R.string.Gift2CollectionsDelete), true, new d5.i(vq0Var, i9, tL_starGiftCollection, 2));
            vq0Var.E = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
