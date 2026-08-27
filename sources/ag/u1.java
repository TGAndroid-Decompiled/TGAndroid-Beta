package ag;

import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import jh.e4;
import jh.i9;
import jh.s6;
import jh.x3;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b7;
import org.telegram.ui.bu;
import org.telegram.ui.do0;
import org.telegram.ui.gw0;
import org.telegram.ui.nc1;
import org.telegram.ui.rn;
import org.telegram.ui.xm0;

public final class u1 implements View.OnClickListener {

    public final int f671a;

    public final boolean f672b;

    public final Object f673c;
    public final Object d;

    public final Object f674e;

    public u1(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f671a = i10;
        this.f673c = obj;
        this.d = obj2;
        this.f672b = z10;
        this.f674e = obj3;
    }

    @Override
    public final void onClick(View view) throws Throwable {
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        switch (this.f671a) {
            case 0:
                g2 g2Var = (g2) this.f673c;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                gw0 gw0Var = (gw0) this.f674e;
                if (n2Var instanceof rn) {
                    rn rnVar = (rn) n2Var;
                    rnVar.A7(true);
                    jh.t2 t2Var = rnVar.F1;
                    if (t2Var != null) {
                        t2Var.dismiss(true);
                    }
                }
                org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
                int i10 = 0;
                while (i10 < 2) {
                    org.telegram.ui.ActionBar.n2 n2Var2 = i10 == 0 ? n2Var : n2VarR;
                    if (n2Var2 != null && n2Var2.getLastStoryViewer() != null) {
                        i9 lastStoryViewer = n2Var2.getLastStoryViewer();
                        Dialog dialog = lastStoryViewer.f13500q0;
                        if (dialog != null) {
                            dialog.dismiss();
                        }
                        org.telegram.ui.ActionBar.j2 j2Var = lastStoryViewer.f13503r0;
                        if (j2Var != null) {
                            j2Var.dismiss();
                        }
                        e4 e4VarT = lastStoryViewer.t();
                        if (e4VarT != null) {
                            wj0 wj0Var = e4VarT.f13221b2;
                            if (wj0Var != null && wj0Var.getReactionsWindow() != null) {
                                e4VarT.f13221b2.getReactionsWindow().d();
                            }
                            jh.w2 w2Var = e4VarT.V2;
                            if (w2Var != null) {
                                w2Var.dismiss();
                            }
                            e4VarT.N0();
                        }
                    }
                    if (n2Var2 != null && n2Var2.getVisibleDialog() != null) {
                        n2Var2.getVisibleDialog().dismiss();
                    }
                    i10++;
                }
                if (this.f672b || g2Var.B) {
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, PremiumPreviewFragment.l0(gw0Var.f38486a));
                    if (n2Var instanceof nc1) {
                        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                        l2Var.f23619a = true;
                        n2Var.showAsSheet(premiumPreviewFragment, l2Var);
                    } else if (n2Var != null) {
                        n2Var.presentFragment(premiumPreviewFragment);
                    } else {
                        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                        if (n2VarU != null) {
                            n2VarU.presentFragment(premiumPreviewFragment);
                        }
                    }
                } else {
                    PremiumPreviewFragment.k0(n2Var, g2Var.F, PremiumPreviewFragment.l0(gw0Var.f38486a), null);
                }
                g2Var.dismiss();
                break;
            case 1:
                x3 x3Var = (x3) this.f673c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                c6 c6Var = (c6) this.f674e;
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItem);
                e4 e4Var = x3Var.f14128l;
                s6 storiesController = MessagesController.getInstance(e4Var.f13296y2).getStoriesController();
                long j10 = e4Var.f13291x1;
                boolean z10 = this.f672b;
                storiesController.o0(j10, arrayList, z10, new jh.d3(x3Var, storyItem, z10, c6Var));
                x3 x3Var2 = e4Var.f13261p1;
                if (x3Var2 != null) {
                    x3Var2.a();
                }
                break;
            case 2:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) this.f673c;
                String str = (String) this.d;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.f674e;
                if (!TextUtils.equals(SharedConfig.storageCacheDir, str)) {
                    if (this.f672b) {
                        SharedConfig.storageCacheDir = str;
                        SharedConfig.saveConfig();
                        SharedConfig.readOnlyStorageDirAlertShowed = false;
                        dataSettingsActivity.n0(dataSettingsActivity.f35462n);
                        ImageLoader.getInstance().checkMediaPaths(new bu(dataSettingsActivity, 2));
                        alertDialog$Builder.f22702a.H0.run();
                    } else {
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(dataSettingsActivity.getParentActivity());
                        alertDialog$Builder2.f22702a.N = LocaleController.getString(R.string.DecreaseSpeed);
                        alertDialog$Builder2.f22702a.P = LocaleController.getString(R.string.SdCardAlert);
                        alertDialog$Builder2.k(LocaleController.getString(R.string.Proceed), new b7(dataSettingsActivity, str, alertDialog$Builder, 12));
                        i0.a.w(R.string.Back, alertDialog$Builder2, null);
                    }
                }
                break;
            case 3:
                final xm0 xm0Var = (xm0) this.f673c;
                final ArrayList arrayList2 = (ArrayList) this.d;
                final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = (TLRPC.TL_secureRequiredType) this.f674e;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            tL_secureRequiredType = (TLRPC.TL_secureRequiredType) arrayList2.get(i11);
                            if (xm0Var.r1(tL_secureRequiredType, false) == null && size != 1) {
                                i11++;
                            }
                        } else {
                            tL_secureRequiredType = null;
                        }
                    }
                } else {
                    tL_secureRequiredType = null;
                }
                TLRPC.SecureValueType secureValueType = tL_secureRequiredType2.type;
                boolean z11 = secureValueType instanceof TLRPC.TL_secureValueTypePersonalDetails;
                final boolean z12 = this.f672b;
                if (!z11 && !(secureValueType instanceof TLRPC.TL_secureValueTypeAddress)) {
                    boolean z13 = secureValueType instanceof TLRPC.TL_secureValueTypePhone;
                    if ((z13 || (secureValueType instanceof TLRPC.TL_secureValueTypeEmail)) && xm0Var.r1(tL_secureRequiredType2, false) != null) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xm0Var.getParentActivity());
                        alertDialog$Builder3.k(LocaleController.getString(R.string.OK), new b5.d(xm0Var, tL_secureRequiredType2, z12, 10));
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.AppName);
                        String string = LocaleController.getString(z13 ? R.string.PassportDeletePhoneAlert : R.string.PassportDeleteEmailAlert);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder3.f22702a;
                        b2Var.P = string;
                        xm0Var.showDialog(b2Var);
                    }
                } else if (tL_secureRequiredType == null && arrayList2 != null && !arrayList2.isEmpty()) {
                    AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xm0Var.getParentActivity());
                    alertDialog$Builder4.k(LocaleController.getString(R.string.Cancel), null);
                    TLRPC.SecureValueType secureValueType2 = tL_secureRequiredType2.type;
                    if (secureValueType2 instanceof TLRPC.TL_secureValueTypePersonalDetails) {
                        alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.PassportIdentityDocument);
                    } else if (secureValueType2 instanceof TLRPC.TL_secureValueTypeAddress) {
                        alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.PassportAddress);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int size2 = arrayList2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        TLRPC.SecureValueType secureValueType3 = ((TLRPC.TL_secureRequiredType) arrayList2.get(i12)).type;
                        if (secureValueType3 instanceof TLRPC.TL_secureValueTypeDriverLicense) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddLicence));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassport) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddPassport));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeInternalPassport) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddInternalPassport));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeIdentityCard) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddCard));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeUtilityBill) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddBill));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeBankStatement) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddBank));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeRentalAgreement) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddAgreement));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypeTemporaryRegistration) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddTemporaryRegistration));
                        } else if (secureValueType3 instanceof TLRPC.TL_secureValueTypePassportRegistration) {
                            arrayList3.add(LocaleController.getString(R.string.PassportAddPassportRegistration));
                        }
                    }
                    alertDialog$Builder4.f((CharSequence[]) arrayList3.toArray(new CharSequence[0]), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            xm0 xm0Var2 = xm0Var;
                            xm0Var2.getClass();
                            ArrayList arrayList4 = arrayList2;
                            xm0Var2.E1(tL_secureRequiredType2, (TLRPC.TL_secureRequiredType) arrayList4.get(i13), arrayList4, z12);
                        }
                    });
                    xm0Var.showDialog(alertDialog$Builder4.f22702a);
                }
                xm0Var.E1(tL_secureRequiredType2, tL_secureRequiredType, arrayList2, z12);
                break;
            case 4:
                do0.g0((do0) this.f673c, (ec) this.d, this.f672b, (TLRPC.Message[]) this.f674e);
                break;
            default:
                do0.Y((do0) this.f673c, (ec) this.d, this.f672b, (TLRPC.Message) this.f674e);
                break;
        }
    }

    public u1(ArrayList arrayList, TLRPC.TL_secureRequiredType tL_secureRequiredType, xm0 xm0Var, boolean z10) {
        this.f671a = 3;
        this.f673c = xm0Var;
        this.d = arrayList;
        this.f674e = tL_secureRequiredType;
        this.f672b = z10;
    }
}
