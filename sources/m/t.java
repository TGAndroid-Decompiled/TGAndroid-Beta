package m;

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
import android.widget.TextView;
import c8.h9;
import c8.mc;
public final class t extends EditText implements r0.n, u0.k {
    public final h2.c f19259a;
    public final x0 f19260b;
    public final z f19261c;
    public final u0.j d;
    public final z f19262e;
    public s f19263f;

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130968776);
        b3.a(context);
        a3.a(this, getContext());
        h2.c cVar = new h2.c(this);
        this.f19259a = cVar;
        cVar.x(attributeSet, 2130968776);
        x0 x0Var = new x0(this);
        this.f19260b = x0Var;
        x0Var.f(attributeSet, 2130968776);
        x0Var.b();
        z zVar = new z();
        zVar.f19321b = this;
        this.f19261c = zVar;
        this.d = new Object();
        z zVar2 = new z(this);
        this.f19262e = zVar2;
        zVar2.b(attributeSet, 2130968776);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a10 = zVar2.a(keyListener);
            if (a10 != keyListener) {
                super.setKeyListener(a10);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    private s getSuperCaller() {
        if (this.f19263f == null) {
            this.f19263f = new s(this);
        }
        return this.f19263f;
    }

    @Override
    public final r0.g a(r0.g gVar) {
        this.d.getClass();
        return u0.j.a(this, gVar);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            cVar.b();
        }
        x0 x0Var = this.f19260b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return mc.d(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            return cVar.v();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            return cVar.w();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f19260b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f19260b.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f19261c) != null) {
            TextClassifier textClassifier = (TextClassifier) zVar.f19322c;
            if (textClassifier == null) {
                return r0.a((TextView) zVar.f19321b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] e10;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f19260b.getClass();
        x0.h(editorInfo, onCreateInputConnection, this);
        h9.a(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (e10 = r0.i0.e(this)) != null) {
            t0.b.b(editorInfo, e10);
            onCreateInputConnection = t0.f.a(onCreateInputConnection, editorInfo, new org.telegram.ui.ActionBar.n3(this, 18));
        }
        return this.f19262e.c(onCreateInputConnection, editorInfo);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i7 = Build.VERSION.SDK_INT;
        boolean z9 = false;
        if (i7 < 31 && i7 >= 24 && dragEvent.getLocalState() == null && r0.i0.e(this) != null) {
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
                z9 = c0.a(dragEvent, this, activity);
            }
        }
        if (z9) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public final boolean onTextContextMenuItem(int i7) {
        ClipData primaryClip;
        r0.d dVar;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && r0.i0.e(this) != null && (i7 == 16908322 || i7 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    dVar = new m2.i(primaryClip, 1);
                } else {
                    r0.e eVar = new r0.e();
                    eVar.f54186b = primaryClip;
                    eVar.f54187c = 1;
                    dVar = eVar;
                }
                if (i7 == 16908322) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                dVar.c(i10);
                r0.i0.h(this, dVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i7);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            cVar.y();
        }
    }

    @Override
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            cVar.z(i7);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19260b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        x0 x0Var = this.f19260b;
        if (x0Var != null) {
            x0Var.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(mc.e(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f19262e.d(z9);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f19262e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            cVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        h2.c cVar = this.f19259a;
        if (cVar != null) {
            cVar.E(mode);
        }
    }

    @Override
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        x0 x0Var = this.f19260b;
        x0Var.l(colorStateList);
        x0Var.b();
    }

    @Override
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        x0 x0Var = this.f19260b;
        x0Var.m(mode);
        x0Var.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        x0 x0Var = this.f19260b;
        if (x0Var != null) {
            x0Var.g(context, i7);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        z zVar;
        if (Build.VERSION.SDK_INT < 28 && (zVar = this.f19261c) != null) {
            zVar.f19322c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return getEditableText();
    }
}
