package ei;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ql0;
public final class j3 extends ql0 {
    public final q3 f9243c;

    public j3(q3 q3Var) {
        this.f9243c = q3Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45915f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        q3 q3Var = this.f9243c;
        if (q3Var.f9626c0) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (q3Var.f9627d0) {
            if (i11 >= 0 && i11 < q3Var.f9624b0.size()) {
                return LocaleController.formatYearMont(((a8) q3Var.f9624b0.get(i11)).d / 1000, true);
            }
            i11 -= q3Var.f9624b0.size();
        }
        ArrayList arrayList = q3Var.f9630f0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) q3Var.f9630f0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(im0 im0Var, float f7, int[] iArr) {
        int i10;
        int k10 = k();
        q3 q3Var = this.f9243c;
        a3 a3Var = q3Var.e;
        float f10 = a3Var.J;
        int width = (int) (((int) (((im0Var.getWidth() - im0Var.getPaddingLeft()) - im0Var.getPaddingRight()) / f10)) * q3Var.O);
        int ceil = (int) Math.ceil(k10 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - im0Var.getPaddingTop()) - im0Var.getPaddingBottom())), f7) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, a3Var.J * round) + 2;
        iArr[1] = im0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(im0 im0Var) {
        q3 q3Var;
        int k10 = k();
        float f7 = this.f9243c.e.J;
        return (Math.max(0, im0Var.computeVerticalScrollOffset() - q3Var.getPadding()) - im0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f7)) * ((int) (((int) (((im0Var.getWidth() - im0Var.getPaddingLeft()) - im0Var.getPaddingRight()) / f7)) * q3Var.O))) - (AndroidUtilities.displaySize.y - im0Var.getPaddingTop()));
    }

    @Override
    public final int h() {
        return k() + 3;
    }

    @Override
    public final int j(int i10) {
        if (i10 != 0 && i10 != h() - 1) {
            if (i10 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int k() {
        int size;
        q3 q3Var = this.f9243c;
        ArrayList arrayList = q3Var.f9630f0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (q3Var.f9626c0) {
            return size + 1;
        }
        if (q3Var.f9627d0) {
            return q3Var.f9624b0.size() + size;
        }
        return size;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        q3 q3Var = this.f9243c;
        ArrayList arrayList = q3Var.f9632h0;
        ArrayList arrayList2 = q3Var.f9624b0;
        int i11 = b1Var.f45915f;
        View view = b1Var.f45912a;
        int i12 = -1;
        if (i11 == 0) {
            n3 n3Var = (n3) view;
            if (i10 == 0) {
                i12 = q3Var.getPadding();
            }
            n3Var.f9508a = i12;
        } else if (i11 == 2) {
            m3 m3Var = (m3) view;
            boolean z13 = true;
            if (i10 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            m3Var.U = z10;
            m3Var.V = z11;
            m3Var.M = new i3(this, m3Var, 0);
            m3Var.N = new i3(this, m3Var, 1);
            int i13 = i10 - 2;
            if (q3Var.f9626c0) {
                if (i13 == 0) {
                    m3Var.f(-1, false, false);
                    m3Var.e(arrayList2.size(), (a8) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (q3Var.f9627d0) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    m3Var.f(-1, false, false);
                    m3Var.e(0, (a8) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = q3Var.f9630f0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f9630f0.get(i13);
                if (arrayList.isEmpty() && !q3Var.Q) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (m3Var.S != photoEntry) {
                    z13 = false;
                }
                m3Var.f(indexOf, z12, z13);
                m3Var.S = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                m3Var.g(str);
                m3Var.F = null;
                if (photoEntry == null) {
                    m3Var.O = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.c1.n(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    m3Var.O = sb2.toString();
                } else {
                    m3Var.O = LocaleController.getString(R.string.AttachPhoto);
                }
                m3Var.b(photoEntry);
                m3Var.invalidate();
                if (q3Var.M) {
                    m3Var.I.setOnClickListener(new ai.v0(this, photoEntry, m3Var, 8));
                }
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        float f7;
        float f10;
        ci.i4 i4Var;
        q3 q3Var = this.f9243c;
        if (i10 == 0) {
            i4Var = new n3(q3Var, q3Var.getContext());
        } else if (i10 == 1) {
            Context context = q3Var.getContext();
            boolean z10 = q3Var.L;
            ci.i4 i4Var2 = new ci.i4(context, 1);
            if (z10) {
                f7 = 14.0f;
            } else {
                f7 = 16.0f;
            }
            i4Var2.setPadding(AndroidUtilities.dp(f7), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(q3Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            i4Var2.addView(textView, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            q3Var.f9633i0 = i4Var2;
            i4Var = i4Var2;
        } else {
            i4Var = new m3(q3Var.getContext(), q3Var.f9623b, q3Var.O, q3Var.M);
        }
        return new s4.b1(i4Var);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        q3 q3Var = this.f9243c;
        ArrayList arrayList = q3Var.f9632h0;
        if (b1Var.f45915f == 2) {
            m3 m3Var = (m3) b1Var.f45912a;
            Object obj = m3Var.S;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !q3Var.Q) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                m3Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            m3Var.f(-1, false, false);
        }
    }
}
