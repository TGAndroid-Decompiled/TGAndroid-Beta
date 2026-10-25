package bi;

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
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.tz0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.dr0;
import org.telegram.ui.gn0;
import org.telegram.ui.in0;
import org.telegram.ui.of0;
import org.telegram.ui.yx;
public final class e6 implements org.telegram.ui.ActionBar.b2, kd0, MediaDataController.KeywordResultCallback, BillingController.ProductDetailsResponseListenerLegacy, OnFailureListener, Utilities.Callback2Return {
    public final int f4554a;
    public final int f4555b;
    public final Object f4556c;
    public final Object d;
    public final Object e;
    public final Object f4557f;

    public e6(int i10, md0 md0Var, org.telegram.ui.Components.f4 f4Var, org.telegram.ui.Components.g4 g4Var, TextView textView) {
        this.f4554a = 1;
        this.f4555b = i10;
        this.f4556c = md0Var;
        this.d = f4Var;
        this.e = g4Var;
        this.f4557f = textView;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        bg.a aVar;
        switch (this.f4554a) {
            case 0:
                g6 g6Var = (g6) this.f4556c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f4557f;
                d6 d6Var = (d6) g6Var.f4672o.get(g6Var.f4674q);
                if (d6Var != null) {
                    bg.a aVar2 = d6Var.f4494c;
                    ca x9 = ca.x(this.f4555b, g6Var.f4674q);
                    if (x9.e) {
                        aVar = bg.a.l(x9.p());
                    } else {
                        aVar = null;
                    }
                    if (aVar != null && aVar2.f3979b > aVar.f3979b) {
                        bg.b bVar = g6Var.f4674q;
                        if (bVar == bg.b.f3980a) {
                            new tc(context, u6Var, aVar2.a(), 14, null, null, 0L).show();
                            return;
                        } else if (bVar == bg.b.f3981b) {
                            new gi.g(context, u6Var, d6Var.f4494c, true, null).show();
                            return;
                        } else {
                            return;
                        }
                    }
                    qf.c cVar = g6Var.f4671n;
                    if (cVar != null) {
                        cVar.a(false);
                        g6Var.f4671n = null;
                    }
                    callback2.run(d6Var, e2Var.h(i10, true, true));
                    return;
                }
                return;
            default:
                SecureDocument secureDocument = (SecureDocument) this.d;
                gn0 gn0Var = (gn0) this.e;
                in0.a0(this.f4555b, (String) this.f4557f, secureDocument, gn0Var, (in0) this.f4556c);
                return;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        sg.p2 p2Var = (sg.p2) this.f4556c;
        Bitmap bitmap = (Bitmap) this.d;
        int i10 = this.f4555b;
        dr0 dr0Var = (dr0) this.e;
        hi.p4 p4Var = (hi.p4) this.f4557f;
        p2Var.f48457x = false;
        FileLog.e(exc);
        if ((exc instanceof ob.a) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded") && p2Var.isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new zr0(p2Var, bitmap, i10, dr0Var, 23), 2000L);
        } else {
            p4Var.run(new ArrayList());
        }
    }

    @Override
    public void onProductDetailsResponse(d5.i iVar, List list) {
        AndroidUtilities.runOnUIThread(new ig.d1((of0) this.f4556c, (String) this.d, iVar, list, (String) this.e, (String) this.f4557f, this.f4555b));
    }

    @Override
    public void q(md0 md0Var, int i10) {
        md0 md0Var2 = (md0) this.f4556c;
        org.telegram.ui.Components.f4 f4Var = (org.telegram.ui.Components.f4) this.d;
        org.telegram.ui.Components.g4 g4Var = (org.telegram.ui.Components.g4) this.e;
        org.telegram.ui.Components.g5.g(null, null, 0L, this.f4555b, 3, md0Var2, f4Var, g4Var);
        org.telegram.ui.Components.g5.e((TextView) this.f4557f, md0Var2, f4Var, g4Var);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        tz0 tz0Var = (tz0) this.f4556c;
        String str2 = (String) this.d;
        HashSet hashSet = (HashSet) this.e;
        ArrayList arrayList2 = (ArrayList) this.f4557f;
        if (this.f4555b != tz0Var.K) {
            return;
        }
        tz0Var.I = 1;
        tz0Var.J = str2;
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
            tz0Var.f33183x = false;
            tz0Var.v = false;
            tz0Var.c();
            bh.r rVar = tz0Var.d;
            if (rVar != null) {
                rVar.setVisibility(0);
            }
            tz0Var.W = AndroidUtilities.dp(10.0f);
            tz0Var.f33182w = arrayList;
            tz0Var.f33170a0 = 0;
            tz0Var.f33172b0 = Integer.valueOf(str2.length());
            bh.r rVar2 = tz0Var.d;
            if (rVar2 != null) {
                rVar2.invalidate();
            }
            qz0 qz0Var = tz0Var.f33177f;
            if (qz0Var != null) {
                qz0Var.l();
                return;
            }
            return;
        }
        tz0Var.f33182w = null;
        tz0Var.f33183x = true;
        tz0Var.f();
    }

    public e6(Object obj, int i10, Object obj2, Object obj3, Object obj4, int i11) {
        this.f4554a = i11;
        this.f4556c = obj;
        this.f4555b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f4557f = obj4;
    }

    public e6(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f4554a = i11;
        this.f4556c = notificationCenterDelegate;
        this.d = obj;
        this.f4555b = i10;
        this.e = obj2;
        this.f4557f = obj3;
    }

    public e6(vs0 vs0Var, int i10, org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f4554a = 6;
        this.f4556c = vs0Var;
        this.f4555b = i10;
        this.f4557f = r2Var;
        this.d = context;
        this.e = u6Var;
    }

    public e6(of0 of0Var, String str, String str2, String str3, int i10) {
        this.f4554a = 3;
        this.f4556c = of0Var;
        this.d = str;
        this.e = str2;
        this.f4557f = str3;
        this.f4555b = i10;
    }

    @Override
    public Object run(Object obj, Object obj2) {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        vs0 vs0Var = (vs0) this.f4556c;
        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f4557f;
        Context context = (Context) this.d;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.e;
        Integer num = (Integer) obj;
        View view = (View) obj2;
        q9 q9Var = vs0Var.e;
        if (num.intValue() != -1 && num.intValue() != -2 && num.intValue() != 0 && !vs0Var.O) {
            int i10 = 0;
            while (true) {
                if (i10 >= q9Var.d().size()) {
                    tL_starGiftCollection = null;
                    i10 = -1;
                    break;
                } else if (((TL_stars.TL_starGiftCollection) q9Var.d().get(i10)).collection_id == num.intValue()) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) q9Var.d().get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = tL_starGiftCollection;
            int i11 = i10;
            int i12 = this.f4555b;
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(i12).getUserOrChat(vs0Var.f53229c));
            boolean h = q9Var.h();
            if (TextUtils.isEmpty(publicUsername) && !h) {
                return Boolean.FALSE;
            }
            k80 H = k80.H(r2Var, view);
            H.W(new xs0(vs0Var));
            H.l(R.drawable.menu_gift_add, LocaleController.getString(R.string.Gift2CollectionsAdd), new zh.r1(vs0Var, 2), h);
            H.l(R.drawable.msg_share, LocaleController.getString(R.string.Gift2CollectionsShare), new ig.d1(vs0Var, i12, publicUsername, tL_starGiftCollection2, context, u6Var, r2Var, 17), !TextUtils.isEmpty(publicUsername));
            H.l(R.drawable.msg_edit, LocaleController.getString(R.string.Gift2CollectionsRename), new vi.i0(11, vs0Var, tL_starGiftCollection2), h);
            H.l(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2CollectionsReorder), new zh.r1(vs0Var, 0), h);
            H.m(R.drawable.msg_delete, new yx(vs0Var, i11, tL_starGiftCollection2, 25), LocaleController.getString(R.string.Gift2CollectionsDelete), h, true);
            vs0Var.I = H;
            H.Z();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
