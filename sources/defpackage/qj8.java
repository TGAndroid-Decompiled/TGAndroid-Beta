package defpackage;

import android.content.DialogInterface;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.r;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ShareActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class qj8 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;

    public qj8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        p09 p09Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                yj8 yj8Var = (yj8) obj;
                w94 w94Var = yj8Var.m2;
                if (w94Var != null) {
                    w94Var.setDialogVisible(false);
                }
                yj8Var.l2.setPaused(false);
                return;
            case 1:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                boolean g = privacyControlActivity.u0.g();
                p09 p09Var2 = privacyControlActivity.v0;
                if (!g) {
                    p09Var2.K(86);
                    privacyControlActivity.w0.e.d();
                    return;
                }
                p09Var2.I(0, false, false);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                boolean g2 = profileActivity.r0.g();
                p09 p09Var3 = profileActivity.V;
                if (!g2) {
                    p09Var3.K(86);
                    profileActivity.W.K(86);
                    qn8 qn8Var = profileActivity.a0;
                    if (qn8Var != null) {
                        nn8 i = qn8.i(14, qn8Var.a);
                        if (i != null && (p09Var = i.k) != null) {
                            p09Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    xib xibVar = profileActivity.N2;
                    if (xibVar != null) {
                        xibVar.getImageView().d();
                        return;
                    }
                    return;
                }
                p09Var3.I(0, false, false);
                profileActivity.W.I(0, false, false);
                return;
            case 3:
                gm.t1((a52) obj);
                return;
            case 4:
                ((jf9) obj).P0 = null;
                return;
            case 5:
                gm.t1((ru9) obj);
                return;
            case 6:
                ((vz9) obj).w(0.0f);
                return;
            case 7:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i2 = ShareActivity.b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.a = null;
                return;
            case 8:
                ((e6a) obj).run();
                return;
            case 9:
                ((s99) obj).run();
                return;
            case 10:
                oab oabVar = (oab) obj;
                if (dialogInterface == oabVar.v0) {
                    oabVar.v0 = null;
                    oabVar.U();
                    return;
                }
                return;
            case 11:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.r = null;
                themeActivity.h = null;
                themeActivity.n = null;
                return;
            case 12:
                ThemeEditorView themeEditorView = ((r) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    gm.s3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
                    try {
                        themeEditorView.j.addView(themeEditorView.c, themeEditorView.i);
                        themeEditorView.e();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 13:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(54, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            case 14:
                ((iic) obj).u0.b();
                return;
            case 15:
                f8c f8cVar = (f8c) obj;
                if (f8cVar != null) {
                    f8cVar.run();
                    return;
                }
                return;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new rrc(user));
                    return;
                }
                return;
            default:
                rrc rrcVar = (rrc) obj;
                EditTextBoldCursor editTextBoldCursor = rrcVar.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    gm.E3(rrcVar.I);
                    return;
                }
                return;
        }
    }
}
