package kh;

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
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.wk0;
public final class j3 extends gk0 {
    public final q3 f15460c;

    public j3(q3 q3Var) {
        this.f15460c = q3Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i9) {
        MediaController.PhotoEntry photoEntry;
        int i10 = i9 - 2;
        q3 q3Var = this.f15460c;
        if (q3Var.V) {
            if (i10 == 0) {
                return null;
            }
            i10 = i9 - 3;
        } else if (q3Var.W) {
            if (i10 >= 0 && i10 < q3Var.U.size()) {
                return LocaleController.formatYearMont(((a8) q3Var.U.get(i10)).d / 1000, true);
            }
            i10 -= q3Var.U.size();
        }
        ArrayList arrayList = q3Var.f15861b0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) q3Var.f15861b0.get(i10)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        int i9;
        int k10 = k();
        q3 q3Var = this.f15460c;
        a3 a3Var = q3Var.f15865e;
        float f11 = a3Var.J;
        int width = (int) (((int) (((wk0Var.getWidth() - wk0Var.getPaddingLeft()) - wk0Var.getPaddingRight()) / f11)) * q3Var.K);
        int ceil = (int) Math.ceil(k10 / f11);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i9 - ((AndroidUtilities.displaySize.y - wk0Var.getPaddingTop()) - wk0Var.getPaddingBottom())), f10) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, a3Var.J * round) + 2;
        iArr[1] = wk0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(wk0 wk0Var) {
        q3 q3Var;
        int k10 = k();
        float f10 = this.f15460c.f15865e.J;
        return (Math.max(0, wk0Var.computeVerticalScrollOffset() - q3Var.getPadding()) - wk0Var.getPaddingTop()) / ((((int) Math.ceil(k10 / f10)) * ((int) (((int) (((wk0Var.getWidth() - wk0Var.getPaddingLeft()) - wk0Var.getPaddingRight()) / f10)) * q3Var.K))) - (AndroidUtilities.displaySize.y - wk0Var.getPaddingTop()));
    }

    @Override
    public final int h() {
        return k() + 3;
    }

    @Override
    public final int j(int i9) {
        if (i9 != 0 && i9 != h() - 1) {
            if (i9 == 1) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final int k() {
        int size;
        q3 q3Var = this.f15460c;
        ArrayList arrayList = q3Var.f15861b0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (q3Var.V) {
            return size + 1;
        }
        if (q3Var.W) {
            return q3Var.U.size() + size;
        }
        return size;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        q3 q3Var = this.f15460c;
        ArrayList arrayList = q3Var.f15864d0;
        ArrayList arrayList2 = q3Var.U;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i11 = -1;
        if (i10 == 0) {
            n3 n3Var = (n3) view;
            if (i9 == 0) {
                i11 = q3Var.getPadding();
            }
            n3Var.f15743a = i11;
        } else if (i10 == 2) {
            m3 m3Var = (m3) view;
            boolean z13 = true;
            if (i9 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i9 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            m3Var.Q = z10;
            m3Var.R = z11;
            m3Var.I = new i3(this, m3Var, 0);
            m3Var.J = new i3(this, m3Var, 1);
            int i12 = i9 - 2;
            if (q3Var.V) {
                if (i12 == 0) {
                    m3Var.f(-1, false, false);
                    m3Var.e(arrayList2.size(), (a8) arrayList2.get(0));
                    return;
                }
                i12 = i9 - 3;
            } else if (q3Var.W) {
                if (i12 >= 0 && i12 < arrayList2.size()) {
                    m3Var.f(-1, false, false);
                    m3Var.e(0, (a8) arrayList2.get(i12));
                    return;
                }
                i12 -= arrayList2.size();
            }
            ArrayList arrayList3 = q3Var.f15861b0;
            if (arrayList3 != null && i12 >= 0 && i12 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) q3Var.f15861b0.get(i12);
                if (arrayList.isEmpty() && !q3Var.M) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (m3Var.O != photoEntry) {
                    z13 = false;
                }
                m3Var.f(indexOf, z12, z13);
                m3Var.O = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                m3Var.g(str);
                m3Var.B = null;
                if (photoEntry == null) {
                    m3Var.K = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Cells.j2.k(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    m3Var.K = sb2.toString();
                } else {
                    m3Var.K = LocaleController.getString(R.string.AttachPhoto);
                }
                m3Var.b(photoEntry);
                m3Var.invalidate();
                if (q3Var.I) {
                    m3Var.E.setOnClickListener(new fg.f(this, photoEntry, m3Var, 14));
                }
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        float f10;
        float f11;
        dh.g gVar;
        q3 q3Var = this.f15460c;
        if (i9 == 0) {
            gVar = new n3(q3Var, q3Var.getContext());
        } else if (i9 == 1) {
            Context context = q3Var.getContext();
            boolean z10 = q3Var.H;
            dh.g gVar2 = new dh.g(context, 2);
            if (z10) {
                f10 = 14.0f;
            } else {
                f10 = 16.0f;
            }
            gVar2.setPadding(AndroidUtilities.dp(f10), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(q3Var.getTitle());
            if (z10) {
                f11 = 32.0f;
            } else {
                f11 = 0.0f;
            }
            gVar2.addView(textView, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, f11, 0.0f));
            q3Var.f15866e0 = gVar2;
            gVar = gVar2;
        } else {
            gVar = new m3(q3Var.getContext(), q3Var.f15860b, q3Var.K, q3Var.I);
        }
        return new f2.q1(gVar);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        boolean z10;
        q3 q3Var = this.f15460c;
        ArrayList arrayList = q3Var.f15864d0;
        if (q1Var.f5505f == 2) {
            m3 m3Var = (m3) q1Var.f5501a;
            Object obj = m3Var.O;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !q3Var.M) {
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
