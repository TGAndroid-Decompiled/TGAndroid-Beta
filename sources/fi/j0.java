package fi;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import w7.x5;
public final class j0 extends nb {
    public final f6 f9759a;
    public final h0 f9760b;
    public final i0 f9761c;
    public final TextView d;
    public final TextView f9762e;
    public k0 f9763f;
    public int h;

    public j0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.h = 0;
        this.f9759a = f6Var;
        h0 h0Var = new h0(AndroidUtilities.dp(10.0f));
        h0Var.f9723a.setColor(j6.v0(j6.Fi, f6Var));
        this.f9760b = h0Var;
        setBackground(h0Var);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        i0 i0Var = new i0(context, imageView);
        this.f9761c = i0Var;
        imageView.setImageDrawable(i0Var);
        addView(imageView, x5.d(40, 40.0f, 23, 7.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, x5.d(-1, -2.0f, 23, 54.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 14.0f);
        int i10 = j6.Hi;
        textView.setTextColor(j6.v0(i10, f6Var));
        textView.setTypeface(AndroidUtilities.bold());
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, x5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.f9762e = h;
        h.setTextSize(1, 13.0f);
        h.setTextColor(j6.v0(i10, f6Var));
        linearLayout.addView(h, x5.t(-1, -2, 55, 0, 0, 0, 0));
    }

    private void setButton(int i10) {
        if (this.h != i10) {
            this.h = i10;
            if (i10 == 0) {
                setButton((mb) null);
                return;
            }
            f6 f6Var = this.f9759a;
            if (i10 == 1) {
                oc ocVar = new oc(getContext(), f6Var, true);
                ocVar.e(LocaleController.getString(R.string.BotFileDownloadCancel));
                ocVar.f29056a = new Runnable(this) {
                    public final j0 f9709b;

                    {
                        this.f9709b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f9709b;
                                qc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f29706j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f9763f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f9709b;
                                qc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f9763f;
                                if (k0Var2 != null && (file = k0Var2.d) != null && file.exists()) {
                                    File file2 = k0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ocVar.f29058c = getBulletin();
                }
                setButton(ocVar);
            } else if (i10 == 2) {
                oc ocVar2 = new oc(getContext(), f6Var, true);
                ocVar2.e(LocaleController.getString(R.string.BotFileDownloadOpen));
                ocVar2.f29056a = new Runnable(this) {
                    public final j0 f9709b;

                    {
                        this.f9709b = this;
                    }

                    @Override
                    public final void run() {
                        File file;
                        switch (r2) {
                            case 0:
                                j0 j0Var = this.f9709b;
                                qc bulletin = j0Var.getBulletin();
                                if (bulletin != null) {
                                    bulletin.f29706j = 2750;
                                    bulletin.i(true);
                                }
                                k0 k0Var = j0Var.f9763f;
                                if (k0Var != null) {
                                    k0Var.a();
                                    return;
                                }
                                return;
                            default:
                                j0 j0Var2 = this.f9709b;
                                qc bulletin2 = j0Var2.getBulletin();
                                if (bulletin2 != null) {
                                    bulletin2.b();
                                }
                                k0 k0Var2 = j0Var2.f9763f;
                                if (k0Var2 != null && (file = k0Var2.d) != null && file.exists()) {
                                    File file2 = k0Var2.d;
                                    AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                                    return;
                                }
                                return;
                        }
                    }
                };
                if (getBulletin() != null) {
                    ocVar2.f29058c = getBulletin();
                }
                setButton(ocVar2);
            }
        }
    }

    public final boolean c(k0 k0Var) {
        boolean z10;
        k0 k0Var2 = this.f9763f;
        i0 i0Var = this.f9761c;
        if (k0Var2 != k0Var) {
            e6 e6Var = i0Var.f9745k;
            i0Var.h = false;
            e6Var.getClass();
            e6Var.d(0.0f, true);
            xi0 xi0Var = i0Var.f9746l;
            if (xi0Var != null) {
                xi0Var.A(true);
                i0Var.f9746l = null;
            }
            e6 e6Var2 = i0Var.f9743i;
            i0Var.f9741f = false;
            e6Var2.getClass();
            e6Var2.d(0.0f, true);
        }
        this.f9763f = k0Var;
        this.d.setText(k0Var.f9775c);
        boolean c10 = k0Var.c();
        TextView textView = this.f9762e;
        if (c10) {
            Pair b10 = k0Var.b();
            i0Var.getClass();
            if (((Long) b10.second).longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i0Var.f9741f = z10;
            if (z10) {
                i0Var.f9742g = Utilities.clamp(((float) ((Long) b10.first).longValue()) / ((float) ((Long) b10.second).longValue()), 1.0f, 0.0f);
            }
            i0Var.invalidateSelf();
            if (((Long) b10.first).longValue() <= 0) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloading));
            } else if (((Long) b10.second).longValue() <= 0) {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()));
            } else {
                textView.setText(AndroidUtilities.formatFileSize(((Long) b10.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) b10.second).longValue()));
            }
            setButton(1);
            return false;
        } else if (k0Var.f9779i) {
            qc bulletin = getBulletin();
            if (bulletin != null) {
                bulletin.b();
            }
            return true;
        } else {
            if (k0Var.h) {
                textView.setText(LocaleController.getString(R.string.BotFileDownloaded));
                setButton(2);
                if (!i0Var.h) {
                    i0Var.h = true;
                    xi0 xi0Var2 = new xi0(R.raw.contact_check, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    i0Var.f9746l = xi0Var2;
                    xi0Var2.f32605v0 = i0Var.f9737a;
                    xi0Var2.H(true);
                    i0Var.f9746l.start();
                    i0Var.f9742g = 1.0f;
                }
                qc bulletin2 = getBulletin();
                if (bulletin2 != null) {
                    bulletin2.i(false);
                    bulletin2.f29706j = 5000;
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
        h0 h0Var = this.f9760b;
        h0Var.getClass();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h0Var.f9726e = z10;
        if (z10) {
            h0Var.f9727f = i10;
        }
        h0Var.invalidateSelf();
    }
}
