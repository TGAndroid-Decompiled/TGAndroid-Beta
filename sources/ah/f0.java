package ah;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i2.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ak;
import org.telegram.ui.nj;
import org.telegram.ui.sn;
public final class f0 extends FrameLayout {
    public final sn f724a;
    public e0 f725b;
    public List f726c;
    public boolean d;
    public MessageObject e;
    public final int f727f;
    public final int h;
    public float f728n;
    public float f729r;
    public float f730s;
    public long v;
    public boolean f731w;
    public boolean f732x;
    public final int[] f733y;

    public f0(sn snVar, Context context) {
        super(context);
        this.f726c = Collections.EMPTY_LIST;
        this.f727f = 22;
        this.h = 24;
        this.f733y = new int[2];
        setVisibility(8);
        this.f724a = snVar;
        setClipToPadding(false);
        setClipChildren(false);
        snVar.f41734x0.j(new d0(this, 0));
    }

    public final void a(boolean z10) {
        if (z10) {
            setVisibility(0);
            post(new b0(this, 1));
            return;
        }
        this.f732x = false;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(150L);
        duration.addUpdateListener(new c0(this, 0));
        duration.addListener(new b(this, 1));
        duration.start();
    }

    public final MessageObject b() {
        MessageObject.GroupedMessages D8;
        ArrayList<MessageObject> arrayList;
        TLRPC.TL_messageReactions tL_messageReactions;
        ArrayList<TLRPC.ReactionCount> arrayList2;
        if (this.d && !this.f726c.isEmpty()) {
            int i10 = 0;
            MessageObject messageObject = (MessageObject) this.f726c.get(0);
            if (messageObject.getGroupId() != 0 && (D8 = this.f724a.D8(messageObject.getGroupId())) != null && (arrayList = D8.messages) != null) {
                int size = arrayList.size();
                while (i10 < size) {
                    MessageObject messageObject2 = arrayList.get(i10);
                    i10++;
                    MessageObject messageObject3 = messageObject2;
                    TLRPC.Message message = messageObject3.messageOwner;
                    if (message != null && (tL_messageReactions = message.reactions) != null && (arrayList2 = tL_messageReactions.results) != null && !arrayList2.isEmpty()) {
                        return messageObject3;
                    }
                }
            }
            return messageObject;
        }
        return null;
    }

    public final void c(boolean z10) {
        int height;
        int height2;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        if (this.d && this.e != null && this.f725b != null) {
            long min = Math.min(16L, System.currentTimeMillis() - this.v);
            this.v = System.currentTimeMillis();
            float f7 = this.f728n;
            float f10 = this.f729r;
            if (f7 != f10) {
                float f11 = ((float) min) / 220.0f;
                if (f10 > f7) {
                    this.f728n = Math.min(f7 + f11, f10);
                } else if (f10 < f7) {
                    this.f728n = Math.max(f7 - f11, f10);
                }
                AndroidUtilities.runOnUIThread(new b0(this, 0));
            }
            sn snVar = this.f724a;
            nj njVar = snVar.f41734x0;
            int[] iArr = this.f733y;
            njVar.getLocationInWindow(iArr);
            boolean z13 = true;
            getLocationInWindow(iArr);
            float f12 = (iArr[1] - iArr[1]) - snVar.Z9;
            boolean z14 = false;
            for (int i12 = 0; i12 < njVar.getChildCount(); i12++) {
                View childAt = njVar.getChildAt(i12);
                if (childAt instanceof t1) {
                    t1 t1Var = (t1) childAt;
                    MessageObject messageObject = t1Var.getMessageObject();
                    if (messageObject.getId() == this.e.getId()) {
                        boolean isOutOwner = messageObject.isOutOwner();
                        e0 e0Var = this.f725b;
                        if (e0Var != null) {
                            e0Var.setMirrorX(isOutOwner);
                            e0 e0Var2 = this.f725b;
                            int dp = AndroidUtilities.dp(4.0f);
                            boolean z15 = LocaleController.isRTL;
                            int i13 = this.h;
                            if (!z15 && !isOutOwner) {
                                i11 = i13;
                            } else {
                                i11 = 0;
                            }
                            int i14 = dp + i11;
                            float f13 = this.f727f;
                            int dp2 = AndroidUtilities.dp(f13);
                            int dp3 = AndroidUtilities.dp(4.0f);
                            if (!LocaleController.isRTL && !isOutOwner) {
                                i13 = 0;
                            }
                            e0Var2.setPadding(i14, dp2, dp3 + i13, AndroidUtilities.dp(f13));
                        }
                        if (getHeight() != 0) {
                            height = getHeight();
                        } else {
                            height = njVar.getHeight();
                        }
                        if (t1Var.getCurrentMessagesGroup() != null) {
                            MessageObject.GroupedMessages.TransitionParams transitionParams = t1Var.getCurrentMessagesGroup().transitionParams;
                            height2 = transitionParams.bottom - transitionParams.top;
                        } else {
                            height2 = t1Var.getHeight();
                        }
                        float y3 = (t1Var.getY() + f12) - AndroidUtilities.dp(74.0f);
                        float dp4 = AndroidUtilities.dp(14.0f);
                        float dp5 = height - AndroidUtilities.dp(218.0f);
                        ak akVar = snVar.f41559j2;
                        if (akVar != null && akVar.getVisibility() == 0) {
                            dp4 += akVar.getHeight();
                        }
                        float f14 = height2;
                        if (y3 > dp4 - (f14 / 2.0f) && y3 < dp5) {
                            this.f729r = 0.0f;
                            z11 = false;
                            z12 = true;
                        } else {
                            if (y3 >= (dp4 - f14) - AndroidUtilities.dp(92.0f) && y3 <= dp5) {
                                this.f730s = AndroidUtilities.dp(56.0f) + height2;
                                this.f729r = 1.0f;
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11;
                        }
                        if (!z10) {
                            this.f728n = this.f729r;
                        }
                        float interpolation = (zr.f33337f.getInterpolation(this.f728n) * this.f730s) + y3;
                        e0 e0Var3 = this.f725b;
                        if (e0Var3 != null) {
                            if (z11 != e0Var3.N) {
                                e0Var3.setFlippedVertically(z11);
                                AndroidUtilities.runOnUIThread(new b0(this, 0));
                            }
                            if (z12 != this.f725b.isEnabled()) {
                                this.f725b.setEnabled(z12);
                                this.f725b.invalidate();
                                if (z12) {
                                    this.f725b.setVisibility(0);
                                    if (!this.f732x) {
                                        this.f732x = true;
                                        this.f725b.p(this.e, snVar.f41589l8, true);
                                    }
                                }
                            }
                            this.f725b.setTranslationY(w7.r.a(interpolation, dp4, dp5));
                            this.f725b.setTranslationX(t1Var.D2(true));
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f725b.getLayoutParams();
                            int g10 = o1.g(32.0f, t1Var.getBackgroundDrawableLeft(), 0);
                            int g11 = o1.g(32.0f, t1Var.getWidth() - t1Var.getBackgroundDrawableRight(), (int) t1Var.D2(true));
                            int dp6 = AndroidUtilities.dp(40.0f) * 8;
                            if ((getWidth() - g11) - g10 < dp6) {
                                if (isOutOwner) {
                                    g10 = Math.min(g10, getWidth() - dp6);
                                    g11 = 0;
                                } else {
                                    g11 = Math.min(g11, getWidth() - dp6);
                                    g10 = 0;
                                }
                            }
                            if (isOutOwner) {
                                i10 = 5;
                            } else {
                                i10 = 3;
                            }
                            if (i10 != layoutParams.gravity) {
                                layoutParams.gravity = i10;
                                z14 = true;
                            }
                            if (g10 != layoutParams.leftMargin) {
                                layoutParams.leftMargin = g10;
                                z14 = true;
                            }
                            if (g11 != layoutParams.rightMargin) {
                                layoutParams.rightMargin = g11;
                            } else {
                                z13 = z14;
                            }
                            if (z13) {
                                this.f725b.requestLayout();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
            e0 e0Var4 = this.f725b;
            if (e0Var4 != null && e0Var4.isEnabled()) {
                this.f725b.setEnabled(false);
            }
        }
    }

    public final boolean d() {
        if (this.d && !this.f731w) {
            return true;
        }
        return false;
    }

    public void setHiddenByScroll(boolean z10) {
        this.f731w = z10;
        if (z10) {
            a(false);
        }
    }

    public void setSelectedMessages(java.util.List<org.telegram.messenger.MessageObject> r10) {
        throw new UnsupportedOperationException("Method not decompiled: ah.f0.setSelectedMessages(java.util.List):void");
    }
}
