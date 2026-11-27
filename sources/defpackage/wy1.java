package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.PhotoViewer;
public abstract class wy1 extends xt3 {
    public za1 f2;
    public final ChatActivityEnterView g2;

    public wy1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.g2 = chatActivityEnterView;
    }

    @Override
    public final void E() {
        xy1 xy1Var = this.g2.O3;
        if (xy1Var != null) {
            xy1Var.B1();
        }
    }

    @Override
    public final void F() {
        xy1 xy1Var = this.g2.O3;
        if (xy1Var != null) {
            xy1Var.e();
        }
    }

    public final void J(Uri uri, String str) {
        boolean z;
        zu1 zu1Var = this.g2.E3;
        if (zu1Var != null && zu1Var.y()) {
            z = true;
        } else {
            z = false;
        }
        Utilities.e.c(new on1(this, uri, hl.q0(MimeTypeMap.getSingleton().getExtensionFromMimeType(str), z), (byte) 12));
    }

    public final void K(File file, ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null && zu1Var.getParentActivity() != null) {
            no6 no6Var = (no6) arrayList.get(0);
            if (chatActivityEnterView.o3) {
                hl.t1(this);
                hl.d3(new uy1(this, arrayList, file, (byte) 0), 100L);
                return;
            }
            PhotoViewer.q0().T1(null, zu1Var, chatActivityEnterView.K4);
            PhotoViewer.q0().o1(arrayList, 0, 2, false, new vy1(this, no6Var, file), chatActivityEnterView.E3);
        }
    }

    public final void L(kj4 kj4Var, boolean z, int i, int i2) {
        r47 threadMessage;
        r47 threadMessage2;
        ChatActivityEnterView chatActivityEnterView = this.g2;
        zu1 zu1Var = chatActivityEnterView.E3;
        q67 q67Var = chatActivityEnterView.M0;
        c5a c5aVar = null;
        if (q67Var != null) {
            q67Var.f(true);
            chatActivityEnterView.M0 = null;
        }
        ou1 ou1Var = chatActivityEnterView.K3;
        if (ou1Var != null && zu1Var != null && ou1Var.f) {
            zu1Var.uc();
            return;
        }
        iq5 iq5Var = (iq5) kj4Var.b;
        boolean hasMimeType = iq5Var.getDescription().hasMimeType("image/gif");
        k5 k5Var = chatActivityEnterView.S;
        if (hasMimeType) {
            Uri e = iq5Var.e();
            long j = chatActivityEnterView.F3;
            r47 r47Var = chatActivityEnterView.I3;
            threadMessage2 = chatActivityEnterView.getThreadMessage();
            ou1 ou1Var2 = chatActivityEnterView.K3;
            if (zu1Var != null) {
                c5aVar = zu1Var.X6();
            }
            r7a.S(k5Var, null, null, e, null, "image/gif", j, r47Var, threadMessage2, null, ou1Var2, z, kj4Var, c5aVar);
        } else {
            Uri e2 = iq5Var.e();
            long j2 = chatActivityEnterView.F3;
            r47 r47Var2 = chatActivityEnterView.I3;
            threadMessage = chatActivityEnterView.getThreadMessage();
            if (zu1Var != null) {
                c5aVar = zu1Var.X6();
            }
            r7a.X(k5Var, e2, j2, r47Var2, threadMessage, kj4Var, null, z, 0, c5aVar);
        }
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.x(null, true, i, i2, 0L);
        }
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wy1.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final vnb getResourcesProvider() {
        return this.g2.K4;
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        zu1 zu1Var = chatActivityEnterView.E3;
        if (zu1Var != null) {
            zu1Var.extendActionMode(menu);
        } else {
            chatActivityEnterView.F0(menu);
        }
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        boolean z;
        ChatActivityEnterView chatActivityEnterView = this.g2;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        try {
            int i = ChatActivityEnterView.X7;
            if (chatActivityEnterView.Q2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !chatActivityEnterView.T7) {
                tu3.b(editorInfo, new String[]{"image/gif", "image/*", "image/jpg", "image/png", "image/webp"});
            } else {
                tu3.b(editorInfo, null);
            }
            return tpe.a(onCreateInputConnection, editorInfo, new rd1(this, (byte) 14));
        } catch (Throwable th) {
            cc4.g(th, true);
            return onCreateInputConnection;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (getMeasuredWidth() == 0 && getMeasuredHeight() == 0) {
            z = true;
        } else {
            z = false;
        }
        ChatActivityEnterView chatActivityEnterView = this.g2;
        chatActivityEnterView.T = z;
        super.onMeasure(i, i2);
        if (chatActivityEnterView.T) {
            int lineCount = getLineCount();
            chatActivityEnterView.U = lineCount;
            if (lineCount > 2 && !TextUtils.isEmpty(getText().toString().trim())) {
                z2 = true;
            } else {
                z2 = false;
            }
            chatActivityEnterView.d2(z2);
            if (chatActivityEnterView.U <= 2 || TextUtils.isEmpty(getText().toString().trim())) {
                z3 = false;
            }
            chatActivityEnterView.k2(z3);
        }
        chatActivityEnterView.T = false;
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        xy1 xy1Var = this.g2.O3;
        if (xy1Var != null) {
            xy1Var.J();
        }
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        boolean z;
        fu5 fu5Var;
        tx1 tx1Var;
        super.onSelectionChanged(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.g2;
        xy1 xy1Var = chatActivityEnterView.O3;
        if (xy1Var != null) {
            xy1Var.w();
        }
        tw1 tw1Var = chatActivityEnterView.R0;
        if (tw1Var != null) {
            if (chatActivityEnterView.E3 != null && (tx1Var = chatActivityEnterView.F0) != null && tx1Var.getSelectionEnd() != chatActivityEnterView.F0.getSelectionStart()) {
                z = true;
            } else {
                z = false;
            }
            if (tw1Var.x != z) {
                tw1Var.x = z;
                tw1Var.invalidate();
            }
            if (!z && (fu5Var = chatActivityEnterView.x7) != null) {
                fu5Var.u();
                chatActivityEnterView.x7 = null;
            }
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ChatActivityEnterView chatActivityEnterView = this.g2;
            chatActivityEnterView.M2 = true;
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("image/*") && chatActivityEnterView.Q2 == null) {
                J(primaryClip.getItemAt(0).getUri(), primaryClip.getDescription().getMimeType(0));
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        ChatActivityEnterView chatActivityEnterView = this.g2;
        if (!chatActivityEnterView.t4 && chatActivityEnterView.q4 == null) {
            if (!chatActivityEnterView.A0 && !chatActivityEnterView.T0()) {
                za1 za1Var = this.f2;
                if (za1Var == null) {
                    za1Var = new za1(this);
                    this.f2 = za1Var;
                    za1Var.h = new Runnable(this) {
                        public final wy1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            wy1 wy1Var = this.b;
                            switch (b) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = wy1Var.g2;
                                    int i2 = ChatActivityEnterView.X7;
                                    chatActivityEnterView2.j2();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = wy1Var.g2;
                                    chatActivityEnterView3.a4 = false;
                                    chatActivityEnterView3.p1();
                                    return;
                            }
                        }
                    };
                }
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                RectF rectF = hl.P;
                rectF.set(0.0f, 0.0f, measuredWidth, measuredHeight);
                za1Var.i = false;
                za1Var.c = 0;
                za1Var.a(rectF);
                return this.f2.b(motionEvent);
            } else if (chatActivityEnterView.U0() && motionEvent.getAction() == 0) {
                if (chatActivityEnterView.G2 != 0) {
                    chatActivityEnterView.Z1(0, false);
                    chatActivityEnterView.V0.r(false);
                    requestFocus();
                }
                if (hl.D) {
                    i = 0;
                } else {
                    i = 2;
                }
                chatActivityEnterView.i2(i, 0, true, true);
                if (chatActivityEnterView.o4) {
                    chatActivityEnterView.a2(false, true, false, true);
                    chatActivityEnterView.a4 = true;
                    hl.d3(new Runnable(this) {
                        public final wy1 b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void run() {
                            byte b = r2;
                            wy1 wy1Var = this.b;
                            switch (b) {
                                case 0:
                                    ChatActivityEnterView chatActivityEnterView2 = wy1Var.g2;
                                    int i2 = ChatActivityEnterView.X7;
                                    chatActivityEnterView2.j2();
                                    return;
                                default:
                                    ChatActivityEnterView chatActivityEnterView3 = wy1Var.g2;
                                    chatActivityEnterView3.a4 = false;
                                    chatActivityEnterView3.p1();
                                    return;
                            }
                        }
                    }, 200L);
                    return true;
                }
                chatActivityEnterView.p1();
                return true;
            } else {
                try {
                    return super.onTouchEvent(motionEvent);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        return false;
    }

    @Override
    public final boolean requestFocus(int i, Rect rect) {
        ChatActivityEnterView chatActivityEnterView = this.g2;
        if (!chatActivityEnterView.A0 && !chatActivityEnterView.T0()) {
            return false;
        }
        return super.requestFocus(i, rect);
    }

    @Override
    public final boolean requestRectangleOnScreen(Rect rect) {
        rect.bottom = hl.L(1000.0f) + rect.bottom;
        return super.requestRectangleOnScreen(rect);
    }

    @Override
    public void setOffsetY(float f) {
        super.setOffsetY(f);
        wma wmaVar = this.g2.b2;
        if (wmaVar.getForeground() != null) {
            wmaVar.invalidateDrawable(wmaVar.getForeground());
        }
    }
}
