package lh;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.yf;
import org.telegram.ui.yq;

public final class e5 implements Utilities.CallbackReturn {

    public final int f15930a;

    public final Object f15931b;

    public final Object f15932c;
    public final Object d;

    public e5(Object obj, Object obj2, Object obj3, int i10) {
        this.f15930a = i10;
        this.f15931b = obj;
        this.f15932c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object run(Object obj) {
        switch (this.f15930a) {
            case 0:
                f6 f6Var = (f6) this.f15931b;
                boolean[] zArr = (boolean[]) this.f15932c;
                o5 o5Var = (o5) this.d;
                Integer num = (Integer) obj;
                z5 z5Var = f6Var.N0;
                t5 t5Var = f6Var.C1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    f6Var.L0(null, new ch.c(f6Var, 28));
                    return Boolean.TRUE;
                }
                if (num.intValue() == 5) {
                    zArr[0] = false;
                    qc.a(true, new gh.d1(11, f6Var, o5Var));
                    return Boolean.FALSE;
                }
                if (num.intValue() == 2) {
                    o5Var.dismiss();
                    sb sbVar = ((va) f6Var).f16954w2;
                    sbVar.Y0.H.b(true);
                    sbVar.w();
                    sbVar.t(true);
                    sbVar.f(true);
                    return Boolean.TRUE;
                }
                if (num.intValue() == 1) {
                    zArr[0] = false;
                    r7 r7Var = new r7(f6Var.getContext(), false, null, new ag.n0(f6Var, 29), new jh.b());
                    r7Var.setOnDismissListener(new v4(f6Var, 2));
                    r7Var.show();
                    return Boolean.TRUE;
                }
                if (num.intValue() == 3) {
                    f6Var.f15972h2 = true;
                    f6Var.d0(f6Var.l0(true));
                    return Boolean.TRUE;
                }
                if (num.intValue() != 4) {
                    return Boolean.FALSE;
                }
                if (!UserConfig.getInstance(f6Var.B1).isPremium()) {
                    try {
                        o5Var.container.performHapticFeedback(3);
                        break;
                    } catch (Exception unused) {
                    }
                    new org.telegram.ui.Components.mc(o5Var.container, t5Var).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new v4(f6Var, 1))).k(true);
                    return Boolean.FALSE;
                }
                int i10 = 0;
                for (int i11 = 0; i11 < z5Var.getChildCount(); i11++) {
                    if (z5Var.getChildAt(i11) instanceof zf.p0) {
                        i10++;
                    }
                }
                if (i10 >= 3) {
                    new org.telegram.ui.Components.mc(o5Var.container, t5Var).M(LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0]), R.raw.linkbroken).k(true);
                    return Boolean.FALSE;
                }
                zArr[0] = false;
                f6Var.K0(null);
                o5Var.dismiss();
                return Boolean.TRUE;
            case 1:
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) this.f15931b;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f15932c;
                Context context = (Context) this.d;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.f27237e;
                if (!(aiComposeTone instanceof TL_aicompose.TL_aiComposeTone)) {
                    return Boolean.FALSE;
                }
                final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                b70 b70VarF = b70.F(e0Var.container, c6Var, c0Var);
                b70VarF.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var)));
                final int i12 = 0;
                b70VarF.l(R.drawable.msg_edit, LocaleController.getString(R.string.AIEditorEditStyle), new Runnable() {
                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), c6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                yVar.f34743f0 = tL_aiComposeTone2;
                                yVar.f34741d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                yVar.X();
                                yVar.W.setText(yVar.f34743f0.title);
                                yVar.X.setText(yVar.f34743f0.prompt);
                                yVar.Z.a(yVar.f34743f0.author_id != 0, false);
                                yVar.f31853e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                yVar.f34740c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                yVar.W();
                                yVar.f34746i0.N(false);
                                yVar.f34745h0 = new e(e0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, c6Var);
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jh.z1(27, e0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                }, tL_aiComposeTone.creator);
                b70VarF.c(R.drawable.msg_share, LocaleController.getString(R.string.AIEditorShareStyle), new yf(e0Var, tL_aiComposeTone, context, c6Var, 10), false);
                b70VarF.m(!tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorRemoveStyle), true, new yq(1, e0Var, tL_aiComposeTone));
                final int i13 = 1;
                b70VarF.m(tL_aiComposeTone.creator, R.drawable.msg_delete, LocaleController.getString(R.string.AIEditorDeleteStyle), true, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                e0 e0Var2 = e0Var;
                                y yVar = new y(e0Var2.getContext(), c6Var);
                                TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                                yVar.f34743f0 = tL_aiComposeTone2;
                                yVar.f34741d0 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                yVar.X();
                                yVar.W.setText(yVar.f34743f0.title);
                                yVar.X.setText(yVar.f34743f0.prompt);
                                yVar.Z.a(yVar.f34743f0.author_id != 0, false);
                                yVar.f31853e.setTitle(LocaleController.getString(R.string.AIEditorEditStyle));
                                yVar.f34740c0.setText(LocaleController.getString(R.string.AIEditorStyleEdit));
                                yVar.W();
                                yVar.f34746i0.N(false);
                                yVar.f34745h0 = new e(e0Var2, 2);
                                yVar.show();
                                break;
                            default:
                                e0 e0Var3 = e0Var;
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e0Var3.getContext(), 0, c6Var);
                                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AIEditorDeleteStyle);
                                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AIEditorDeleteStyleText);
                                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new jh.z1(27, e0Var3, tL_aiComposeTone));
                                alertDialog$Builder.d(-1);
                                alertDialog$Builder.o();
                                break;
                        }
                    }
                });
                b70VarF.Z();
                return Boolean.TRUE;
            case 2:
                String str = (String) this.f15931b;
                String str2 = (String) this.f15932c;
                MessageObject messageObject = ((ah.h) this.d).f768b;
                return ah.c.d((View) obj, str, str2, messageObject.getDocument(), messageObject);
            default:
                zk0 zk0Var = (zk0) this.f15931b;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.f15932c;
                SparseIntArray sparseIntArray = (SparseIntArray) this.d;
                View view = (View) obj;
                try {
                    if (view.getParent() != zk0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) callbackReturn.run(view);
                    boolean zBooleanValue = bool.booleanValue();
                    f2.o1 o1VarT = zk0Var.T(view);
                    if (o1VarT != null) {
                        sparseIntArray.put(o1VarT.f5793f, zBooleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
