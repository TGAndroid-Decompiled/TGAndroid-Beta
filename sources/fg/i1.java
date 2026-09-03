package fg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g90;
import org.telegram.ui.jd1;
import org.telegram.ui.v70;
import org.telegram.ui.ww0;
import qh.e3;
public final class i1 extends m2.a {
    public final int f6338c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public i1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6338c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        switch (this.f6338c) {
            case 0:
                hVar.removeView((View) obj);
                return;
            case 1:
                hVar.removeView((View) obj);
                return;
            default:
                hVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f6338c) {
            case 0:
                return ((n1) this.d).d.size();
            case 1:
                return ((v70) this.d).C.length;
            default:
                if (((jd1) this.d).f37964b != 0) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f6338c) {
            case 2:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        boolean z4;
        float f10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        int i11;
        View view;
        switch (this.f6338c) {
            case 0:
                n1 n1Var = (n1) this.d;
                m1 m1Var = new m1(n1Var, n1Var.getContext(), i10);
                hVar.addView(m1Var);
                m1Var.f6390a = i10;
                ww0 ww0Var = (ww0) n1Var.d.get(i10);
                int i12 = ww0Var.f42867a;
                String str = ww0Var.d;
                CharSequence charSequence = ww0Var.f42869c;
                int i13 = 8;
                TextView textView = m1Var.f6391b;
                g90 g90Var = m1Var.f6392c;
                if (i12 != 0 && i12 != 14 && i12 != 28) {
                    if (n1Var.B) {
                        int i14 = n1Var.f6420y;
                        if (i14 == 4) {
                            textView.setText(LocaleController.getString(R.string.AdditionalReactions));
                            i11 = R.string.AdditionalReactionsDescription;
                        } else if (i14 == 3) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewNoAds));
                            i11 = R.string.PremiumPreviewNoAdsDescription2;
                        } else if (i14 == 24) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewTags));
                            i11 = R.string.PremiumPreviewTagsDescription;
                        } else if (i14 == 10) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewAppIcon));
                            i11 = R.string.PremiumPreviewAppIconDescription2;
                        } else if (i14 == 2) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewDownloadSpeed));
                            i11 = R.string.PremiumPreviewDownloadSpeedDescription2;
                        } else if (i14 == 9) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement));
                            i11 = R.string.PremiumPreviewAdvancedChatManagementDescription2;
                        } else if (i14 == 8) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewVoiceToText));
                            i11 = R.string.PremiumPreviewVoiceToTextDescription2;
                        } else if (i14 == 13) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewTranslations));
                            i11 = R.string.PremiumPreviewTranslationsDescription;
                        } else if (i14 == 38) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewEffects));
                            i11 = R.string.PremiumPreviewEffectsDescription;
                        } else if (i14 == 22) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewWallpaper));
                            i11 = R.string.PremiumPreviewWallpaperDescription;
                        } else if (i14 == 23) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewProfileColor));
                            i11 = R.string.PremiumPreviewProfileColorDescription;
                        } else if (i14 == 41) {
                            textView.setText(LocaleController.getString(R.string.PremiumPreviewSharingDisable));
                            i11 = R.string.PremiumPreviewSharingDisableDescription;
                        } else {
                            textView.setText(charSequence);
                            g90Var.setText(AndroidUtilities.replaceTags(str));
                            m1Var.h = false;
                        }
                        org.telegram.ui.b.n(i11, g90Var);
                        m1Var.h = false;
                    } else {
                        textView.setText(charSequence);
                        g90Var.setText(AndroidUtilities.replaceTags(str));
                        m1Var.h = false;
                    }
                } else {
                    textView.setText("");
                    g90Var.setText("");
                    m1Var.h = true;
                }
                g90Var.setMaxWidth(e3.a(g90Var.getText(), g90Var.getPaint()));
                m1Var.requestLayout();
                if (ww0Var.f42867a == 40) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 && m1Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(m1Var.getContext());
                    m1Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = m1Var.getContext();
                    g6Var = ((h3) n1Var).resourcesProvider;
                    sh.i iVar = new sh.i(context, g6Var, true);
                    iVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    m1Var.d.addView(r2[0], c6.n(-1, -2));
                    Context context2 = m1Var.getContext();
                    g6Var2 = ((h3) n1Var).resourcesProvider;
                    sh.i iVar2 = new sh.i(context2, g6Var2, true);
                    iVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    m1Var.d.addView(r2[1], c6.n(-1, -2));
                    Context context3 = m1Var.getContext();
                    g6Var3 = ((h3) n1Var).resourcesProvider;
                    sh.i iVar3 = new sh.i(context3, g6Var3, true);
                    sh.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    m1Var.d.addView(iVarArr[2], c6.n(-1, -2));
                    m1Var.addView(m1Var.d, c6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = m1Var.d;
                if (linearLayout2 != null) {
                    if (z4) {
                        i13 = 0;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) g90Var.getLayoutParams();
                if (z4) {
                    f10 = 6.0f;
                } else {
                    f10 = 10.0f;
                }
                marginLayoutParams.topMargin = AndroidUtilities.dp(f10);
                return m1Var;
            case 1:
                TextView textView2 = new TextView(hVar.getContext());
                v70 v70Var = (v70) this.d;
                textView2.setTag(v70Var.f42018a);
                TextView textView3 = new TextView(hVar.getContext());
                textView3.setTag(v70Var.f42019b);
                ag.l lVar = new ag.l(hVar.getContext(), textView2, textView3);
                int i15 = k6.G6;
                textView2.setTextColor(k6.w0(null, i15, false));
                textView2.setTextSize(1, 26.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setGravity(17);
                lVar.addView(textView2, c6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView3.setTextColor(k6.w0(null, i15, false));
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView3.setGravity(17);
                lVar.addView(textView3, c6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                hVar.addView(lVar, 0);
                textView2.setText(v70Var.C[i10]);
                textView3.setText(AndroidUtilities.replaceTags(v70Var.D[i10]));
                return lVar;
            default:
                jd1 jd1Var = (jd1) this.d;
                if (i10 == 0) {
                    view = jd1Var.f38003q0;
                } else {
                    view = jd1Var.f37990j0;
                }
                hVar.addView(view);
                return view;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f6338c) {
            case 0:
                if (view == obj) {
                    return true;
                }
                return false;
            case 1:
                return view.equals(obj);
            default:
                if (obj == view) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public void h(int i10) {
        switch (this.f6338c) {
            case 1:
                v70 v70Var = (v70) this.d;
                v70Var.f42021e.setCurrentPage(i10);
                v70Var.E = i10;
                return;
            default:
                return;
        }
    }
}
