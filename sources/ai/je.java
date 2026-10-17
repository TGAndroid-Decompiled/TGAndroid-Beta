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
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.yq;
public final class je extends View {
    public final boolean f1609a;
    public final ArrayList f1610b;
    public final ArrayList f1611c;
    public final Paint d;
    public final org.telegram.ui.Components.f6 e;
    public float f1612f;
    public ie h;
    public Utilities.Callback f1613n;
    public final ke f1614r;

    public je(ke keVar, Context context, boolean z10) {
        super(context);
        this.f1614r = keVar;
        this.f1610b = new ArrayList();
        this.f1611c = new ArrayList();
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new org.telegram.ui.Components.f6(this, 0L, 320L, bs.h);
        this.f1609a = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, keVar.f1737b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.f1610b;
        this.f1612f = this.e.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f1611c;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((ie) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ie) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f1610b;
            if (i10 < arrayList.size()) {
                ((ie) arrayList.get(i10)).f1541k.onAttachedToWindow();
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
            ArrayList arrayList = this.f1610b;
            if (i10 < arrayList.size()) {
                ((ie) arrayList.get(i10)).f1541k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ie ieVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            ie ieVar2 = this.h;
            if (ieVar2 != null) {
                ieVar2.f1547q.c(false);
            }
            this.h = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f1610b;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((ie) arrayList.get(i10)).f1535b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.h = (ie) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            ie ieVar3 = this.h;
            if (ieVar3 != null) {
                ieVar3.f1547q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (ieVar = this.h) != null && !ieVar.f1546p && ieVar.f1535b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f1613n) != null) {
                callback.run(Long.valueOf(this.h.f1540j));
            }
            ie ieVar4 = this.h;
            if (ieVar4 != null) {
                ieVar4.f1547q.c(false);
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
            ArrayList arrayList = this.f1610b;
            if (i10 < arrayList.size()) {
                ie ieVar = (ie) arrayList.get(i10);
                if (ieVar.f1539i) {
                    ieVar.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f1613n = callback;
    }

    public void setSenders(ArrayList<de> arrayList) {
        ArrayList arrayList2;
        yq[] yqVarArr;
        ArrayList arrayList3;
        ?? r82;
        ie ieVar;
        String shortName;
        ArrayList<de> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.f1610b;
            int size = arrayList2.size();
            yqVarArr = null;
            de deVar = null;
            arrayList3 = this.f1611c;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            ie ieVar2 = (ie) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                de deVar2 = arrayList4.get(i11);
                boolean z10 = deVar2.f1183b;
                if ((z10 && ieVar2.f1539i) || (!ieVar2.f1539i && !z10 && deVar2.f1184c == ieVar2.f1540j)) {
                    deVar = arrayList4.get(i11);
                    break;
                }
            }
            if (deVar == null) {
                ieVar2.f1541k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                ieVar2.f1534a = -1;
                arrayList3.add(ieVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            de deVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                ie ieVar3 = (ie) arrayList2.get(i13);
                boolean z11 = ieVar3.f1539i;
                if ((z11 && deVar3.f1183b) || (!z11 && !deVar3.f1183b && ieVar3.f1540j == deVar3.f1184c)) {
                    ieVar = (ie) arrayList2.get(i13);
                    break;
                }
            }
            ieVar = yqVarArr;
            if (ieVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    ie ieVar4 = (ie) arrayList3.get(i14);
                    boolean z12 = ieVar4.f1539i;
                    if ((z12 && deVar3.f1183b) || (!z12 && !deVar3.f1183b && ieVar4.f1540j == deVar3.f1184c)) {
                        ieVar = (ie) arrayList3.get(i14);
                        break;
                    }
                }
                if (ieVar != null) {
                    arrayList3.remove(ieVar);
                    ieVar.f1541k.onAttachedToWindow();
                    arrayList2.add(ieVar);
                }
            }
            if (ieVar == null) {
                ieVar = new ie(this, deVar3.f1183b, deVar3.f1184c);
                ieVar.d.d(0.0f, r82);
                arrayList2.add(ieVar);
                ieVar.f1536c.d((arrayList4.size() - r82) - i12, r82);
            }
            je jeVar = ieVar.f1552w;
            ke keVar = jeVar.f1614r;
            ieVar.f1534a = (arrayList4.size() - r82) - i12;
            long j10 = deVar3.d;
            Paint paint = ieVar.h;
            ieVar.f1545o = new d11(ld.S0(org.telegram.messenger.q.h(j10, ',', new StringBuilder("⭐️")), 0.85f, yqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = jeVar.f1609a;
            int i15 = keVar.f1738c;
            if (z13) {
                int i16 = (int) j10;
                ieVar.f1537f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                ieVar.f1548r = i0.b.f(0.5f, ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3));
                paint.setShader(ieVar.f1537f);
            } else {
                paint.setShader(null);
                ieVar.f1548r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = ieVar.f1549s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(ieVar.f1548r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f1609a) {
                int i17 = i12 + 1;
                ieVar.v = i17;
                ieVar.f1551u = new d11(i0.a.j(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && ieVar.f1549s == null) {
                    Drawable mutate = jeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    ieVar.f1549s = mutate;
                    int i18 = ieVar.f1548r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = jeVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    ieVar.f1550t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, keVar.f1737b), mode));
                }
            }
            if (deVar3.f1183b) {
                ieVar.b(this.f1614r.E);
            } else {
                boolean z14 = deVar3.f1182a;
                if (!ieVar.f1539i && ieVar.f1546p != z14) {
                    ieVar.f1546p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(ieVar.f1540j);
                    }
                    yqVarArr = null;
                    ieVar.f1544n = new d11(shortName, 12.0f, null);
                    jeVar.invalidate();
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
