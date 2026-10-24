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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.zr;
public final class le extends View implements org.telegram.ui.ActionBar.b6 {
    public PorterDuffColorFilter f1787a;
    public int f1788b;
    public final boolean f1789c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f1790f;
    public final org.telegram.ui.Components.d6 h;
    public float f1791n;
    public ke f1792r;
    public Utilities.Callback f1793s;
    public final me v;

    public le(me meVar, Context context, boolean z10) {
        super(context);
        this.v = meVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f1790f = paint;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 320L, zr.h);
        this.f1789c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21255h5, meVar.f1840b));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f1791n = this.h.d(arrayList.size(), false);
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ((ke) arrayList2.get(i10)).a(canvas);
            i10++;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((ke) arrayList.get(i11)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((ke) arrayList.get(i10)).f1652k.onAttachedToWindow();
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
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ((ke) arrayList.get(i10)).f1652k.onDetachedFromWindow();
                i10++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ke keVar;
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            ke keVar2 = this.f1792r;
            if (keVar2 != null) {
                keVar2.f1658q.c(false);
            }
            this.f1792r = null;
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (((ke) arrayList.get(i10)).f1646b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f1792r = (ke) arrayList.get(i10);
                    break;
                } else {
                    i10++;
                }
            }
            ke keVar3 = this.f1792r;
            if (keVar3 != null) {
                keVar3.f1658q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (keVar = this.f1792r) != null && !keVar.f1657p && keVar.f1646b.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.f1793s) != null) {
                callback.run(Long.valueOf(this.f1792r.f1651j));
            }
            ke keVar4 = this.f1792r;
            if (keVar4 != null) {
                keVar4.f1658q.c(false);
            }
            this.f1792r = null;
        }
        if (this.f1792r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 < arrayList.size()) {
                ke keVar = (ke) arrayList.get(i10);
                if (keVar.f1650i) {
                    keVar.b(j10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
        this.f1793s = callback;
    }

    public void setSenders(ArrayList<fe> arrayList) {
        ArrayList arrayList2;
        vq[] vqVarArr;
        ArrayList arrayList3;
        ?? r82;
        ke keVar;
        String shortName;
        ArrayList<fe> arrayList4 = arrayList;
        int i10 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            vqVarArr = null;
            fe feVar = null;
            arrayList3 = this.e;
            r82 = 1;
            if (i10 >= size) {
                break;
            }
            ke keVar2 = (ke) arrayList2.get(i10);
            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                fe feVar2 = arrayList4.get(i11);
                boolean z10 = feVar2.f1328b;
                if ((z10 && keVar2.f1650i) || (!keVar2.f1650i && !z10 && feVar2.f1329c == keVar2.f1651j)) {
                    feVar = arrayList4.get(i11);
                    break;
                }
            }
            if (feVar == null) {
                keVar2.f1652k.onDetachedFromWindow();
                arrayList2.remove(i10);
                i10--;
                keVar2.f1645a = -1;
                arrayList3.add(keVar2);
            }
            i10++;
        }
        int i12 = 0;
        while (i12 < arrayList4.size()) {
            fe feVar3 = arrayList4.get(i12);
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                ke keVar3 = (ke) arrayList2.get(i13);
                boolean z11 = keVar3.f1650i;
                if ((z11 && feVar3.f1328b) || (!z11 && !feVar3.f1328b && keVar3.f1651j == feVar3.f1329c)) {
                    keVar = (ke) arrayList2.get(i13);
                    break;
                }
            }
            keVar = vqVarArr;
            if (keVar == null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    ke keVar4 = (ke) arrayList3.get(i14);
                    boolean z12 = keVar4.f1650i;
                    if ((z12 && feVar3.f1328b) || (!z12 && !feVar3.f1328b && keVar4.f1651j == feVar3.f1329c)) {
                        keVar = (ke) arrayList3.get(i14);
                        break;
                    }
                }
                if (keVar != null) {
                    arrayList3.remove(keVar);
                    keVar.f1652k.onAttachedToWindow();
                    arrayList2.add(keVar);
                }
            }
            if (keVar == null) {
                keVar = new ke(this, feVar3.f1328b, feVar3.f1329c);
                keVar.d.d(0.0f, r82);
                arrayList2.add(keVar);
                keVar.f1647c.d((arrayList4.size() - r82) - i12, r82);
            }
            le leVar = keVar.f1663w;
            me meVar = leVar.v;
            keVar.f1645a = (arrayList4.size() - r82) - i12;
            long j10 = feVar3.d;
            Paint paint = keVar.h;
            keVar.f1656o = new h11(nd.S0(i2.o1.m(j10, ',', new StringBuilder("⭐️")), 0.85f, vqVarArr), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            boolean z13 = leVar.f1789c;
            int i15 = meVar.f1841c;
            if (z13) {
                int i16 = (int) j10;
                keVar.f1648f = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                keVar.f1659r = i0.a.f(0.5f, ci.u.b(i15, i16, 4), ci.u.b(i15, i16, 3));
                paint.setShader(keVar.f1648f);
            } else {
                paint.setShader(null);
                keVar.f1659r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = keVar.f1660s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(keVar.f1659r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f1789c) {
                int i17 = i12 + 1;
                keVar.v = i17;
                keVar.f1662u = new h11(i2.o1.k(i17, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                if (i17 > 0 && keVar.f1660s == null) {
                    Drawable mutate = leVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                    keVar.f1660s = mutate;
                    int i18 = keVar.f1659r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i18, mode));
                    Drawable mutate2 = leVar.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                    keVar.f1661t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21255h5, meVar.f1840b), mode));
                }
            }
            if (feVar3.f1328b) {
                keVar.b(this.v.E);
            } else {
                boolean z14 = feVar3.f1327a;
                if (!keVar.f1650i && keVar.f1657p != z14) {
                    keVar.f1657p = z14;
                    if (z14) {
                        shortName = LocaleController.getString(R.string.StarsReactionAnonymous);
                    } else {
                        shortName = DialogObject.getShortName(keVar.f1651j);
                    }
                    vqVarArr = null;
                    keVar.f1655n = new h11(shortName, 12.0f, null);
                    leVar.invalidate();
                    i12++;
                    arrayList4 = arrayList;
                    r82 = 1;
                }
            }
            vqVarArr = null;
            i12++;
            arrayList4 = arrayList;
            r82 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: ai.le.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
