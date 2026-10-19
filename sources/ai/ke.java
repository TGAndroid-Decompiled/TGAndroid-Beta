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
import org.telegram.ui.Components.e11;
import org.telegram.ui.Components.yq;
public final class ke extends View {
    public final boolean f1725a;
    public final ArrayList f1726b;
    public final ArrayList f1727c;
    public final Paint d;
    public final org.telegram.ui.Components.f6 e;
    public float f1728f;
    public je h;
    public Utilities.Callback f1729n;
    public final le f1730r;

    public ke(le leVar, Context context, boolean z10) {
        super(context);
        this.f1730r = leVar;
        this.f1726b = new ArrayList();
        this.f1727c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.f1725a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h5, leVar.f1786b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f1726b;
        this.f1728f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1727c;
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
            ArrayList arrayList = this.f1726b;
            if (i10 < arrayList.size()) {
                ((je) arrayList.get(i10)).f1591k.onAttachedToWindow();
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
            ArrayList arrayList = this.f1726b;
            if (i10 < arrayList.size()) {
                ((je) arrayList.get(i10)).f1591k.onDetachedFromWindow();
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
                jeVar2.f1597q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1726b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((je) arrayList.get(i10)).f1585b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (je) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            je jeVar3 = this.h;
            if (jeVar3 != null) {
                jeVar3.f1597q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (jeVar = this.h) != null && !jeVar.f1596p && jeVar.f1585b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f1729n) != null) {
                callback.run(Long.valueOf(this.h.f1590j));
            }
            je jeVar4 = this.h;
            if (jeVar4 != null) {
                jeVar4.f1597q.c(false);
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
            ArrayList arrayList = this.f1726b;
            if (i10 < arrayList.size()) {
                je jeVar = (je) arrayList.get(i10);
                if (jeVar.f1589i) {
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
        this.f1729n = callback;
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
            arrayList2 = this.f1726b;
            int size = arrayList2.size();
            yqVarArr = null;
            ee eeVar = null;
            arrayList3 = this.f1727c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            je jeVar2 = (je) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                ee eeVar2 = arrayList4.get(i11);
                boolean z10 = eeVar2.f1263b;
                if ((z10 && jeVar2.f1589i) || (!jeVar2.f1589i && !z10 && eeVar2.f1264c == jeVar2.f1590j)) {
                    eeVar = arrayList4.get(i11);
                    break;
                }
            }
            if (eeVar == null) {
                jeVar2.f1591k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                jeVar2.f1584a = -1;
                arrayList3.add(jeVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            ee eeVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                je jeVar3 = (je) arrayList2.get(i13);
                boolean z11 = jeVar3.f1589i;
                if ((z11 && eeVar3.f1263b) || (!z11 && !eeVar3.f1263b && jeVar3.f1590j == eeVar3.f1264c)) {
                    jeVar = (je) arrayList2.get(i13);
                    break;
                }
            }
            jeVar = yqVarArr;
            if (jeVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    je jeVar4 = (je) arrayList3.get(i14);
                    boolean z12 = jeVar4.f1589i;
                    if ((z12 && eeVar3.f1263b) || (!z12 && !eeVar3.f1263b && jeVar4.f1590j == eeVar3.f1264c)) {
                        jeVar = (je) arrayList3.get(i14);
                        break;
                    }
                }
                if (jeVar != null) {
                    arrayList3.remove(jeVar);
                    jeVar.f1591k.onAttachedToWindow();
                    arrayList2.add(jeVar);
                }
            }
            if (jeVar == null) {
                jeVar = new je(this, eeVar3.f1263b, eeVar3.f1264c);
                jeVar.d.d(0.0f, r82);
                arrayList2.add(jeVar);
                jeVar.f1586c.d((arrayList4.size() - r82) - i12, r82);
            }
            ke keVar = jeVar.f1602w;
            le leVar = keVar.f1730r;
            jeVar.f1584a = (arrayList4.size() - r82) - i12;
            long j10 = eeVar3.d;
            Paint paint = jeVar.h;
            jeVar.f1595o = new e11(md.S0(org.telegram.messenger.g0.h(j10, ',', new StringBuilder("⭐️")), 0.85f, yqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = keVar.f1725a;
            int i15 = leVar.f1787c;
            if (z13) {
                int i16 = (int) j10;
                jeVar.f1587f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                jeVar.f1598r = i0.a.f(0.5f, ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3));
                paint.setShader(jeVar.f1587f);
            } else {
                paint.setShader(null);
                jeVar.f1598r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = jeVar.f1599s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(jeVar.f1598r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f1725a) {
                int i17 = i12 + 1;
                jeVar.v = i17;
                jeVar.f1601u = new e11(i2.e.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && jeVar.f1599s == null) {
                    Drawable mutate = keVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    jeVar.f1599s = mutate;
                    int i18 = jeVar.f1598r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = keVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    jeVar.f1600t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21060h5, leVar.f1786b), mode));
                }
            }
            if (eeVar3.f1263b) {
                jeVar.b(this.f1730r.E);
            } else {
                boolean z14 = eeVar3.f1262a;
                if (!jeVar.f1589i && jeVar.f1596p != z14) {
                    jeVar.f1596p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(jeVar.f1590j);
                    }
                    yqVarArr = null;
                    jeVar.f1594n = new e11(shortName, 12.0f, null);
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
