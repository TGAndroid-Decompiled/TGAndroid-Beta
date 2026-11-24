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
public final class ph8 implements DialogInterface.OnDismissListener {
    public final byte a;
    public final Object b;

    public ph8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        oy8 oy8Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                xh8 xh8Var = (xh8) obj;
                n84 n84Var = xh8Var.m2;
                if (n84Var != null) {
                    n84Var.setDialogVisible(false);
                }
                xh8Var.l2.setPaused(false);
                return;
            case 1:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                boolean g = privacyControlActivity.u0.g();
                oy8 oy8Var2 = privacyControlActivity.v0;
                if (!g) {
                    oy8Var2.K(86);
                    privacyControlActivity.w0.e.d();
                    return;
                }
                oy8Var2.I(0, false, false);
                return;
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                boolean g2 = profileActivity.r0.g();
                oy8 oy8Var3 = profileActivity.V;
                if (!g2) {
                    oy8Var3.K(86);
                    profileActivity.W.K(86);
                    pl8 pl8Var = profileActivity.a0;
                    if (pl8Var != null) {
                        ml8 i = pl8.i(14, pl8Var.a);
                        if (i != null && (oy8Var = i.k) != null) {
                            oy8Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    wgb wgbVar = profileActivity.N2;
                    if (wgbVar != null) {
                        wgbVar.getImageView().d();
                        return;
                    }
                    return;
                }
                oy8Var3.I(0, false, false);
                profileActivity.W.I(0, false, false);
                return;
            case 3:
                gl.t1((p32) obj);
                return;
            case 4:
                ((hd9) obj).P0 = null;
                return;
            case 5:
                gl.t1((ps9) obj);
                return;
            case 6:
                ((tx9) obj).w(0.0f);
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
                ((t7a) obj).run();
                return;
            case 9:
                ((q79) obj).run();
                return;
            case 10:
                m8b m8bVar = (m8b) obj;
                if (dialogInterface == m8bVar.v0) {
                    m8bVar.v0 = null;
                    m8bVar.U();
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
                    gl.s3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
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
                twoStepVerificationActivity.getNotificationCenter().k(53, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                return;
            case 14:
                ((hgc) obj).u0.b();
                return;
            case 15:
                kbc kbcVar = (kbc) obj;
                if (kbcVar != null) {
                    kbcVar.run();
                    return;
                }
                return;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new qpc(user));
                    return;
                }
                return;
            default:
                qpc qpcVar = (qpc) obj;
                EditTextBoldCursor editTextBoldCursor = qpcVar.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    gl.E3(qpcVar.I);
                    return;
                }
                return;
        }
    }
}
