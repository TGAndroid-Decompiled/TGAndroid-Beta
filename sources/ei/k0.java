package ei;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
import w7.z5;
public final class k0 extends ob {
    public final d6 f9123a;
    public final i0 f9124b;
    public final j0 f9125c;
    public final TextView d;
    public final TextView f9126e;
    public l0 f9127f;
    public int h;

    public k0(Context context, d6 d6Var) {
        super(context, d6Var);
        this.h = 0;
        this.f9123a = d6Var;
        i0 i0Var = new i0(AndroidUtilities.dp(10.0f));
        i0Var.f9087a.setColor(i6.v0(i6.Fi, d6Var));
        this.f9124b = i0Var;
        setBackground(i0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        j0 j0Var = new j0(context, imageView);
        this.f9125c = j0Var;
        imageView.setImageDrawable(j0Var);
        addView(imageView, z5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = i6.Hi;
        textView.setTextColor(i6.v0(i10, d6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f9126e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(i6.v0(i10, d6Var));
        linearLayout.addView(h, z5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((nb) null);
                return;
            }
            d6 d6Var = this.f9123a;
            if (i10 == 1) {
                pc pcVar = new pc(getContext(), d6Var, true);
                pcVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                pcVar.f29600a = new Runnable(this) {
                    public final k0 f9073b;

                    {
                        this.f9073b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                k0 k0Var = this.f9073b;
                                rc bulletin = k0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f30345j = 2750;
                                    bulletin.i(true);
                                }
                                l0 l0Var = k0Var.f9127f;
                                if (l0Var != null) {
                                    l0Var.a();
                                    return;
                                }
                                return;
                            default:
                                k0 k0Var2 = this.f9073b;
                                rc bulletin2 = k0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                l0 l0Var2 = k0Var2.f9127f;
                                if (l0Var2 != null && (file = l0Var2.d) != null && file.exists()) {
                                    File file2 = l0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    pcVar.f29602c = getBulletin();
                }
                setButton(pcVar);
            } else if (i10 == 2) {
                pc pcVar2 = new pc(getContext(), d6Var, true);
                pcVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                pcVar2.f29600a = new Runnable(this) {
                    public final k0 f9073b;

                    {
                        this.f9073b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                k0 k0Var = this.f9073b;
                                rc bulletin = k0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f30345j = 2750;
                                    bulletin.i(true);
                                }
                                l0 l0Var = k0Var.f9127f;
                                if (l0Var != null) {
                                    l0Var.a();
                                    return;
                                }
                                return;
                            default:
                                k0 k0Var2 = this.f9073b;
                                rc bulletin2 = k0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                l0 l0Var2 = k0Var2.f9127f;
                                if (l0Var2 != null && (file = l0Var2.d) != null && file.exists()) {
                                    File file2 = l0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    pcVar2.f29602c = getBulletin();
                }
                setButton(pcVar2);
            }
        }
    }

    public final boolean c(l0 l0Var) {
        boolean z10;
        l0 l0Var2 = this.f9127f;
        j0 j0Var = this.f9125c;
        if (l0Var2 != l0Var) {
            e6 e6Var = j0Var.f9114k;
            j0Var.h = false;
            e6Var.getClass();
            e6Var.d(0.0f, true);
            kj0 kj0Var = j0Var.f9115l;
            if (kj0Var != null) {
                kj0Var.C(true);
                j0Var.f9115l = null;
            }
            e6 e6Var2 = j0Var.f9112i;
            j0Var.f9110f = false;
            e6Var2.getClass();
            e6Var2.d(0.0f, true);
        }
        this.f9127f = l0Var;
        this.d.setText(l0Var.f9139c);
        boolean c10 = l0Var.c();
        TextView textView = this.f9126e;
        if (c10) {
            Pair b10 = l0Var.b();
            j0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j0Var.f9110f = z10;
            if (z10) {
                j0Var.f9111g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            j0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (l0Var.f9143i) {
            rc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (l0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!j0Var.h) {
                    j0Var.h = true;
                    kj0 kj0Var2 = new kj0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    j0Var.f9115l = kj0Var2;
                    kj0Var2.R(j0Var.f9106a);
                    j0Var.f9115l.J(true);
                    j0Var.f9115l.start();
                    j0Var.f9111g = 1.0f;
                }
                rc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f30345j = 5000;
                    bulletin2.i(true);
                }
            }
            return false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
    }

    public void setArrow(int i10) {
        boolean z10;
        i0 i0Var = this.f9124b;
        i0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0Var.f9090e = z10;
        if (z10) {
            i0Var.f9091f = i10;
        }
        i0Var.invalidateSelf();
    }
}
