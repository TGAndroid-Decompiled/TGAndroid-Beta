package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
public final class hp extends EditText implements fp7, zob {
    public final ko a;
    public final pq b;
    public final hq c;
    public final zib d;
    public final lv6 e;
    public gp f;

    public hp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        xob.a(context);
        cnb.a(getContext(), this);
        ko koVar = new ko(this);
        this.a = koVar;
        koVar.g(attributeSet, 2130968776);
        pq pqVar = new pq(this);
        this.b = pqVar;
        pqVar.f(attributeSet, 2130968776);
        pqVar.b();
        ?? obj = new Object();
        obj.a = this;
        this.c = obj;
        this.d = new Object();
        lv6 lv6Var = new lv6(this);
        this.e = lv6Var;
        lv6Var.w(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener s = lv6Var.s(keyListener);
            if (s != keyListener) {
                super.setKeyListener(s);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private gp getSuperCaller() {
        gp gpVar = this.f;
        if (gpVar == null) {
            gp gpVar2 = new gp(this);
            this.f = gpVar2;
            return gpVar2;
        }
        return gpVar;
    }

    @Override
    public final hv2 a(hv2 hv2Var) {
        this.d.getClass();
        return zib.a(this, hv2Var);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ko koVar = this.a;
        if (koVar != null) {
            koVar.b();
        }
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return kve.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.e();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ko koVar = this.a;
        if (koVar != null) {
            return koVar.f();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return getEditableText();
    }

    @Override
    public TextClassifier getTextClassifier() {
        hq hqVar;
        if (Build.VERSION.SDK_INT < 28 && (hqVar = this.c) != null) {
            TextClassifier textClassifier = hqVar.b;
            if (textClassifier == null) {
                return gq.a(hqVar.a);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] f;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        pq.h(editorInfo, onCreateInputConnection, this);
        gmd.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (f = jdc.f(this)) != null) {
            au3.b(editorInfo, f);
            onCreateInputConnection = ble.a(onCreateInputConnection, editorInfo, new ry4(this, (byte) 10));
        }
        return this.e.x(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && jdc.f(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = qp.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        dv2 dv2Var;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && jdc.f(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i3 >= 31) {
                    dv2Var = new cv2(primaryClip, 1);
                } else {
                    ev2 ev2Var = new ev2();
                    ev2Var.b = primaryClip;
                    ev2Var.c = (byte) 1;
                    dv2Var = ev2Var;
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                dv2Var.d(i2);
                jdc.i(this, dv2Var.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.h();
        }
    }

    @Override
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ko koVar = this.a;
        if (koVar != null) {
            koVar.i(i);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(kve.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.I(z);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.s(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.m(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ko koVar = this.a;
        if (koVar != null) {
            koVar.n(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        pq pqVar = this.b;
        pqVar.l(colorStateList);
        pqVar.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        pq pqVar = this.b;
        pqVar.m(mode);
        pqVar.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        pq pqVar = this.b;
        if (pqVar != null) {
            pqVar.g(context, i);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        hq hqVar;
        if (Build.VERSION.SDK_INT < 28 && (hqVar = this.c) != null) {
            hqVar.b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }
}
