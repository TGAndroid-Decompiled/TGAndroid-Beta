package nh;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.tk0;
public final class g3 extends tk0 {
    public final n3 f17692c;

    public g3(n3 n3Var) {
        this.f17692c = n3Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        MediaController.PhotoEntry photoEntry;
        int i11 = i10 - 2;
        n3 n3Var = this.f17692c;
        if (n3Var.V) {
            if (i11 == 0) {
                return null;
            }
            i11 = i10 - 3;
        } else if (n3Var.W) {
            if (i11 >= 0 && i11 < n3Var.U.size()) {
                return LocaleController.formatYearMont(((o7) n3Var.U.get(i11)).d / 1000, true);
            }
            i11 -= n3Var.U.size();
        }
        ArrayList arrayList = n3Var.f18170b0;
        if (arrayList == null || i11 < 0 || i11 >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) n3Var.f18170b0.get(i11)) == null) {
            return null;
        }
        long j10 = photoEntry.dateTaken;
        if (Build.VERSION.SDK_INT <= 28) {
            j10 /= 1000;
        }
        return LocaleController.formatYearMont(j10, true);
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        int i10;
        int k9 = k();
        n3 n3Var = this.f17692c;
        x2 x2Var = n3Var.f18174e;
        float f10 = x2Var.J;
        int width = (int) (((int) (((jl0Var.getWidth() - jl0Var.getPaddingLeft()) - jl0Var.getPaddingRight()) / f10)) * n3Var.K);
        int ceil = (int) Math.ceil(k9 / f10);
        float lerp = (AndroidUtilities.lerp(0, Math.max(0, i10 - ((AndroidUtilities.displaySize.y - jl0Var.getPaddingTop()) - jl0Var.getPaddingBottom())), f9) / (ceil * width)) * ceil;
        int round = Math.round(lerp);
        iArr[0] = Math.max(0, x2Var.J * round) + 2;
        iArr[1] = jl0Var.getPaddingTop() + ((int) ((lerp - round) * width));
    }

    @Override
    public final float H(jl0 jl0Var) {
        n3 n3Var;
        int k9 = k();
        float f9 = this.f17692c.f18174e.J;
        return (Math.max(0, jl0Var.computeVerticalScrollOffset() - n3Var.getPadding()) - jl0Var.getPaddingTop()) / ((((int) Math.ceil(k9 / f9)) * ((int) (((int) (((jl0Var.getWidth() - jl0Var.getPaddingLeft()) - jl0Var.getPaddingRight()) / f9)) * n3Var.K))) - (AndroidUtilities.displaySize.y - jl0Var.getPaddingTop()));
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
        n3 n3Var = this.f17692c;
        ArrayList arrayList = n3Var.f18170b0;
        if (arrayList == null) {
            size = 0;
        } else {
            size = arrayList.size();
        }
        if (n3Var.V) {
            return size + 1;
        }
        if (n3Var.W) {
            return n3Var.U.size() + size;
        }
        return size;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        n3 n3Var = this.f17692c;
        ArrayList arrayList = n3Var.f18173d0;
        ArrayList arrayList2 = n3Var.U;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i12 = -1;
        if (i11 == 0) {
            k3 k3Var = (k3) view;
            if (i10 == 0) {
                i12 = n3Var.getPadding();
            }
            k3Var.f18000a = i12;
        } else if (i11 == 2) {
            j3 j3Var = (j3) view;
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
            j3Var.Q = z10;
            j3Var.R = z11;
            j3Var.I = new f3(this, j3Var, 0);
            j3Var.J = new f3(this, j3Var, 1);
            int i13 = i10 - 2;
            if (n3Var.V) {
                if (i13 == 0) {
                    j3Var.f(-1, false, false);
                    j3Var.e(arrayList2.size(), (o7) arrayList2.get(0));
                    return;
                }
                i13 = i10 - 3;
            } else if (n3Var.W) {
                if (i13 >= 0 && i13 < arrayList2.size()) {
                    j3Var.f(-1, false, false);
                    j3Var.e(0, (o7) arrayList2.get(i13));
                    return;
                }
                i13 -= arrayList2.size();
            }
            ArrayList arrayList3 = n3Var.f18170b0;
            if (arrayList3 != null && i13 >= 0 && i13 < arrayList3.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) n3Var.f18170b0.get(i13);
                if (arrayList.isEmpty() && !n3Var.M) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                int indexOf = arrayList.indexOf(photoEntry);
                if (j3Var.O != photoEntry) {
                    z13 = false;
                }
                j3Var.f(indexOf, z12, z13);
                j3Var.O = photoEntry;
                if (photoEntry != null && photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                    str = AndroidUtilities.formatShortDuration(photoEntry.duration);
                } else {
                    str = null;
                }
                j3Var.g(str);
                j3Var.B = null;
                if (photoEntry == null) {
                    j3Var.K = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.b.j(R.string.AttachVideo, ", ", sb2);
                    sb2.append(LocaleController.formatDuration(photoEntry.duration));
                    j3Var.K = sb2.toString();
                } else {
                    j3Var.K = LocaleController.getString(R.string.AttachPhoto);
                }
                j3Var.b(photoEntry);
                j3Var.invalidate();
                if (n3Var.I) {
                    j3Var.E.setOnClickListener(new bg.q(this, photoEntry, j3Var, 15));
                }
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        float f9;
        float f10;
        bh.d dVar;
        n3 n3Var = this.f17692c;
        if (i10 == 0) {
            dVar = new k3(n3Var, n3Var.getContext());
        } else if (i10 == 1) {
            Context context = n3Var.getContext();
            boolean z10 = n3Var.H;
            bh.d dVar2 = new bh.d(context, 5);
            if (z10) {
                f9 = 14.0f;
            } else {
                f9 = 16.0f;
            }
            dVar2.setPadding(AndroidUtilities.dp(f9), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(-1);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(n3Var.getTitle());
            if (z10) {
                f10 = 32.0f;
            } else {
                f10 = 0.0f;
            }
            dVar2.addView(textView, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, f10, 0.0f));
            n3Var.f18175e0 = dVar2;
            dVar = dVar2;
        } else {
            dVar = new j3(n3Var.getContext(), n3Var.f18169b, n3Var.K, n3Var.I);
        }
        return new f2.n1(dVar);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        boolean z10;
        n3 n3Var = this.f17692c;
        ArrayList arrayList = n3Var.f18173d0;
        if (n1Var.f6436f == 2) {
            j3 j3Var = (j3) n1Var.f6432a;
            Object obj = j3Var.O;
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (arrayList.isEmpty() && !n3Var.M) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                j3Var.f(arrayList.indexOf(photoEntry), z10, false);
                return;
            }
            j3Var.f(-1, false, false);
        }
    }
}
