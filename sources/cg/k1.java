package cg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import nh.t3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.y80;
import org.telegram.ui.fw0;
import org.telegram.ui.k70;
import org.telegram.ui.qc1;
public final class k1 extends m2.a {
    public final int f3183c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public k1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f3183c = i10;
        this.d = notificationCenterDelegate;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        switch (this.f3183c) {
            case 0:
                gVar.removeView((View) obj);
                return;
            case 1:
                gVar.removeView((View) obj);
                return;
            default:
                gVar.removeView((View) obj);
                return;
        }
    }

    @Override
    public final int b() {
        switch (this.f3183c) {
            case 0:
                return ((p1) this.d).d.size();
            case 1:
                return ((k70) this.d).B.length;
            default:
                if (((qc1) this.d).f41626b != 0) {
                    return 1;
                }
                return 2;
        }
    }

    @Override
    public int c(Object obj) {
        switch (this.f3183c) {
            case 2:
                return -1;
            default:
                return super.c(obj);
        }
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        boolean z10;
        float f9;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        int i11;
        View view;
        switch (this.f3183c) {
            case 0:
                p1 p1Var = (p1) this.d;
                o1 o1Var = new o1(p1Var, p1Var.getContext(), i10);
                gVar.addView(o1Var);
                o1Var.f3239a = i10;
                fw0 fw0Var = (fw0) p1Var.d.get(i10);
                int i12 = fw0Var.f38243a;
                String str = fw0Var.d;
                CharSequence charSequence = fw0Var.f38245c;
                int i13 = 8;
                TextView textView = o1Var.f3240b;
                y80 y80Var = o1Var.f3241c;
                if (i12 != 0 && i12 != 14 && i12 != 28) {
                    if (p1Var.A) {
                        int i14 = p1Var.f3272y;
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
                            y80Var.setText(AndroidUtilities.replaceTags(str));
                            o1Var.h = false;
                        }
                        org.telegram.ui.b.o(i11, y80Var);
                        o1Var.h = false;
                    } else {
                        textView.setText(charSequence);
                        y80Var.setText(AndroidUtilities.replaceTags(str));
                        o1Var.h = false;
                    }
                } else {
                    textView.setText("");
                    y80Var.setText("");
                    o1Var.h = true;
                }
                y80Var.setMaxWidth(t3.a(y80Var.getText(), y80Var.getPaint()));
                o1Var.requestLayout();
                if (fw0Var.f38243a == 40) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 && o1Var.d == null) {
                    LinearLayout linearLayout = new LinearLayout(o1Var.getContext());
                    o1Var.d = linearLayout;
                    linearLayout.setOrientation(1);
                    Context context = o1Var.getContext();
                    c6Var = ((f3) p1Var).resourcesProvider;
                    ph.i iVar = new ph.i(context, c6Var, true);
                    iVar.a(LocaleController.getString(R.string.GiftsFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    o1Var.d.addView(r2[0], f6.n(-1, -2));
                    Context context2 = o1Var.getContext();
                    c6Var2 = ((f3) p1Var).resourcesProvider;
                    ph.i iVar2 = new ph.i(context2, c6Var2, true);
                    iVar2.a(LocaleController.getString(R.string.GiftsFeature2Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    o1Var.d.addView(r2[1], f6.n(-1, -2));
                    Context context3 = o1Var.getContext();
                    c6Var3 = ((f3) p1Var).resourcesProvider;
                    ph.i iVar3 = new ph.i(context3, c6Var3, true);
                    ph.i[] iVarArr = {iVar, iVar2, iVar3};
                    iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                    o1Var.d.addView(iVarArr[2], f6.n(-1, -2));
                    o1Var.addView(o1Var.d, f6.k(0.0f, -4.0f, 0.0f, 0.0f, -1, -2));
                }
                LinearLayout linearLayout2 = o1Var.d;
                if (linearLayout2 != null) {
                    if (z10) {
                        i13 = 0;
                    }
                    linearLayout2.setVisibility(i13);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) y80Var.getLayoutParams();
                if (z10) {
                    f9 = 6.0f;
                } else {
                    f9 = 10.0f;
                }
                marginLayoutParams.topMargin = AndroidUtilities.dp(f9);
                return o1Var;
            case 1:
                TextView textView2 = new TextView(gVar.getContext());
                k70 k70Var = (k70) this.d;
                textView2.setTag(k70Var.f39772a);
                TextView textView3 = new TextView(gVar.getContext());
                textView3.setTag(k70Var.f39773b);
                bg.d1 d1Var = new bg.d1(gVar.getContext(), textView2, textView3);
                int i15 = g6.G6;
                textView2.setTextColor(g6.w0(null, i15, false));
                textView2.setTextSize(1, 26.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setGravity(17);
                d1Var.addView(textView2, f6.d(-1, -2.0f, 51, 18.0f, 244.0f, 18.0f, 0.0f));
                textView3.setTextColor(g6.w0(null, i15, false));
                textView3.setTextSize(1, 15.0f);
                textView3.setLineSpacing(AndroidUtilities.dpf2(2.33f), 1.0f);
                textView3.setGravity(17);
                d1Var.addView(textView3, f6.d(-1, -2.0f, 51, 16.0f, 286.0f, 16.0f, 0.0f));
                gVar.addView(d1Var, 0);
                textView2.setText(k70Var.B[i10]);
                textView3.setText(AndroidUtilities.replaceTags(k70Var.C[i10]));
                return d1Var;
            default:
                qc1 qc1Var = (qc1) this.d;
                if (i10 == 0) {
                    view = qc1Var.f41662p0;
                } else {
                    view = qc1Var.f41649i0;
                }
                gVar.addView(view);
                return view;
        }
    }

    @Override
    public final boolean f(View view, Object obj) {
        switch (this.f3183c) {
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
        switch (this.f3183c) {
            case 1:
                k70 k70Var = (k70) this.d;
                k70Var.f39775e.setCurrentPage(i10);
                k70Var.D = i10;
                return;
            default:
                return;
        }
    }
}
