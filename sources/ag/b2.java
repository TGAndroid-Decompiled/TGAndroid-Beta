package ag;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.p80;
import org.telegram.ui.gw0;
import org.telegram.ui.l70;
import org.telegram.ui.nc1;

public final class b2 extends m2.a {

    public final int f310c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public b2(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f310c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        switch (this.f310c) {
            case 0:
                gVar.removeView((View) obj);
                break;
            case 1:
                gVar.removeView((View) obj);
                break;
            default:
                gVar.removeView((View) obj);
                break;
        }
    }

    @Override
    public final int b() {
        switch (this.f310c) {
            case 0:
                return ((g2) this.d).d.size();
            case 1:
                return ((l70) this.d).B.length;
            default:
                return ((nc1) this.d).f40738b != 0 ? 1 : 2;
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f310c) {
            case 2:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        int i11;
        switch (this.f310c) {
            case 0:
                g2 g2Var = (g2) this.d;
                f2 f2Var = new f2(g2Var, g2Var.getContext(), i10);
                gVar.addView(f2Var);
                f2Var.f375a = i10;
                gw0 gw0Var = (gw0) g2Var.d.get(i10);
                int i12 = gw0Var.f38486a;
                String str = gw0Var.d;
                CharSequence charSequence = gw0Var.f38488c;
                TextView textView = f2Var.f376b;
                p80 p80Var = f2Var.f377c;
                if (i12 == 0 || i12 == 14 || i12 == 28) {
                    textView.setText("");
                    p80Var.setText("");
                    f2Var.h = true;
                } else if (g2Var.A) {
                    int i13 = g2Var.f399y;
                    if (i13 == 4) {
                        textView.setText(LocaleController.getString(R.string.AdditionalReactions));
                        i11 = R.string.AdditionalReactionsDescription;
                    } else if (i13 == 3) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                        i11 = R.string.PremiumPreviewNoAdsDescription2;
                    } else if (i13 == 24) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                        i11 = R.string.PremiumPreviewTagsDescription;
                    } else if (i13 == 10) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                        i11 = R.string.PremiumPreviewAppIconDescription2;
                    } else if (i13 == 2) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                        i11 = R.string.PremiumPreviewDownloadSpeedDescription2;
                    } else if (i13 == 9) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                        i11 = R.string.PremiumPreviewAdvancedChatManagementDescription2;
                    } else if (i13 == 8) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                        i11 = R.string.PremiumPreviewVoiceToTextDescription2;
                    } else if (i13 == 13) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                        i11 = R.string.PremiumPreviewTranslationsDescription;
                    } else if (i13 == 38) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                        i11 = R.string.PremiumPreviewEffectsDescription;
                    } else if (i13 == 22) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                        i11 = R.string.PremiumPreviewWallpaperDescription;
                    } else if (i13 == 23) {
                        textView.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                        i11 = R.string.PremiumPreviewProfileColorDescription;
                    } else {
                        if (i13 == 41) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                            i11 = R.string.PremiumPreviewSharingDisableDescription;
                        } else {
                            textView.setText(charSequence);
                            p80Var.setText(AndroidUtilities.replaceTags(str));
                        }
                        f2Var.h = false;
                    }
                    pa.q(i11, p80Var);
                    f2Var.h = false;
                } else {
                    textView.setText(charSequence);
                    p80Var.setText(AndroidUtilities.replaceTags(str));
                    f2Var.h = false;
                }
                p80Var.setMaxWidth(w3.a(p80Var.getText(), p80Var.getPaint()));
                f2Var.requestLayout();
                boolean z10 = gw0Var.f38486a == 40;
                if (z10 && f2Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(f2Var.getContext());
                    f2Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    nh.j jVar = new nh.j(f2Var.getContext(), ((org.telegram.ui.ActionBar.e3) g2Var).resourcesProvider, true);
                    jVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    f2Var.d.addView(jVarArr[0], z5.n(-1, -2));
                    nh.j jVar2 = new nh.j(f2Var.getContext(), ((org.telegram.ui.ActionBar.e3) g2Var).resourcesProvider, true);
                    jVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    f2Var.d.addView(jVarArr[1], z5.n(-1, -2));
                    nh.j jVar3 = new nh.j(f2Var.getContext(), ((org.telegram.ui.ActionBar.e3) g2Var).resourcesProvider, true);
                    nh.j[] jVarArr = {jVar, jVar2, jVar3};
                    jVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    f2Var.d.addView(jVarArr[2], z5.n(-1, -2));
                    f2Var.addView(f2Var.d, z5.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = f2Var.d;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(z10 ? 0 : 8);
                }
                ((ViewGroup.MarginLayoutParams) p80Var.getLayoutParams()).topMargin = AndroidUtilities.dp(z10 ? 6.0f : 10.0f);
                return f2Var;
            case 1:
                TextView textView2 = new TextView(gVar.getContext());
                l70 l70Var = (l70) this.d;
                textView2.setTag(l70Var.f39962a);
                TextView textView3 = new TextView(gVar.getContext());
                textView3.setTag(l70Var.f39963b);
                y1 y1Var = new y1(gVar.getContext(), textView2, textView3);
                int i14 = g6.G6;
                textView2.setTextColor(g6.w0(null, i14, false));
                textView2.setTextSize(1, 26.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setGravity(17);
                y1Var.addView(textView2, z5.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView3.setTextColor(g6.w0(null, i14, false));
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView3.setGravity(17);
                y1Var.addView(textView3, z5.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(y1Var, 0);
                textView2.setText(l70Var.B[i10]);
                textView3.setText(AndroidUtilities.replaceTags(l70Var.C[i10]));
                return y1Var;
            default:
                nc1 nc1Var = (nc1) this.d;
                View view = i10 == 0 ? nc1Var.f40774p0 : nc1Var.f40761i0;
                gVar.addView(view);
                return view;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f310c) {
            case 0:
                return view == obj;
            case 1:
                return view.equals(obj);
            default:
                return obj == view;
        }
    }

    @Override
    public void h(int i10) {
        switch (this.f310c) {
            case 1:
                l70 l70Var = (l70) this.d;
                l70Var.f39965e.setCurrentPage(i10);
                l70Var.D = i10;
                break;
        }
    }
}
