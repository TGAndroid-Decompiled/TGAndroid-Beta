package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.yq;
public final class ke extends View {
    public final boolean f1666a;
    public final ArrayList f1667b;
    public final ArrayList f1668c;
    public final Paint d;
    public final org.telegram.ui.Components.f6 e;
    public float f1669f;
    public je h;
    public Utilities.Callback f1670n;
    public final le f1671r;

    public ke(le leVar, Context context, boolean z10) {
        super(context);
        this.f1671r = leVar;
        this.f1667b = new ArrayList();
        this.f1668c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.f1666a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, leVar.f1790b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f1667b;
        this.f1669f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1668c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((je) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((je) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1667b;
            if (i10 < arrayList.size()) {
                ((je) arrayList.get(i10)).f1604k.onAttachedToWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1667b;
            if (i10 < arrayList.size()) {
                ((je) arrayList.get(i10)).f1604k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        je jeVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            je jeVar2 = this.h;
            if (jeVar2 != null) {
                jeVar2.f1610q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1667b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((je) arrayList.get(i10)).f1598b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (je) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            je jeVar3 = this.h;
            if (jeVar3 != null) {
                jeVar3.f1610q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (jeVar = this.h) != null && !jeVar.f1609p && jeVar.f1598b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f1670n) != null) {
                callback.run(Long.valueOf(this.h.f1603j));
            }
            je jeVar4 = this.h;
            if (jeVar4 != null) {
                jeVar4.f1610q.c(false);
            }
            this.h = null;
        }
        if (this.h == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1667b;
            if (i10 < arrayList.size()) {
                je jeVar = (je) arrayList.get(i10);
                if (jeVar.f1602i) {
                    jeVar.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f1670n = callback;
    }

    public void setSenders(ArrayList<ee> arrayList) {
        ArrayList arrayList2;
        yq[] yqVarArr;
        ArrayList arrayList3;
        ?? r82;
        je jeVar;
        String shortName;
        ArrayList<ee> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f1667b;
            int size = arrayList2.size();
            yqVarArr = null;
            ee eeVar = null;
            arrayList3 = this.f1668c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            je jeVar2 = (je) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ee eeVar2 = arrayList4.get(i11);
                boolean z10 = eeVar2.f1240b;
                if ((z10 && jeVar2.f1602i) || (!jeVar2.f1602i && !z10 && eeVar2.f1241c == jeVar2.f1603j)) {
                    eeVar = arrayList4.get(i11);
                    break;
                }
            }
            if (eeVar == null) {
                jeVar2.f1604k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                jeVar2.f1597a = -1;
                arrayList3.add(jeVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            ee eeVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                je jeVar3 = (je) arrayList2.get(i13);
                boolean z11 = jeVar3.f1602i;
                if ((z11 && eeVar3.f1240b) || (!z11 && !eeVar3.f1240b && jeVar3.f1603j == eeVar3.f1241c)) {
                    jeVar = (je) arrayList2.get(i13);
                    break;
                }
            }
            jeVar = yqVarArr;
            if (jeVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    je jeVar4 = (je) arrayList3.get(i14);
                    boolean z12 = jeVar4.f1602i;
                    if ((z12 && eeVar3.f1240b) || (!z12 && !eeVar3.f1240b && jeVar4.f1603j == eeVar3.f1241c)) {
                        jeVar = (je) arrayList3.get(i14);
                        break;
                    }
                }
                if (jeVar != null) {
                    arrayList3.remove(jeVar);
                    jeVar.f1604k.onAttachedToWindow();
                    arrayList2.add(jeVar);
                }
            }
            if (jeVar == null) {
                jeVar = new je(this, eeVar3.f1240b, eeVar3.f1241c);
                jeVar.d.d(0.0f, r82);
                arrayList2.add(jeVar);
                jeVar.f1599c.d((arrayList4.size() - r82) - i12, r82);
            }
            ke keVar = jeVar.f1615w;
            le leVar = keVar.f1671r;
            jeVar.f1597a = (arrayList4.size() - r82) - i12;
            long j10 = eeVar3.d;
            Paint paint = jeVar.h;
            jeVar.f1608o = new f11(md.S0(org.telegram.messenger.g0.h(j10, ',', new StringBuilder("⭐️")), 0.85f, yqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = keVar.f1666a;
            int i15 = leVar.f1791c;
            if (z13) {
                int i16 = (int) j10;
                jeVar.f1600f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jeVar.f1611r = i0.a.f(0.5f, ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3));
                paint.setShader(jeVar.f1600f);
            } else {
                paint.setShader(null);
                jeVar.f1611r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = jeVar.f1612s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(jeVar.f1611r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f1666a) {
                int i17 = i12 + 1;
                jeVar.v = i17;
                jeVar.f1614u = new f11(i2.e.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && jeVar.f1612s == null) {
                    Drawable mutate = keVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    jeVar.f1612s = mutate;
                    int i18 = jeVar.f1611r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = keVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    jeVar.f1613t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21064h5, leVar.f1790b), mode));
                }
            }
            if (eeVar3.f1240b) {
                jeVar.b(this.f1671r.E);
            } else {
                boolean z14 = eeVar3.f1239a;
                if (!jeVar.f1602i && jeVar.f1609p != z14) {
                    jeVar.f1609p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(jeVar.f1603j);
                    }
                    yqVarArr = null;
                    jeVar.f1607n = new f11(shortName, 12.0f, null);
                    keVar.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            yqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }
}
