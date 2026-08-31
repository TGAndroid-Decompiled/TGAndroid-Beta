package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.tl0;
import qh.o4;
public final class r1 extends tl0 {
    public final ArrayList U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final o4 Z2;

    public r1(o4 o4Var, Context context, a9.a aVar) {
        super(context, aVar);
        this.Z2 = o4Var;
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList(10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        float f11;
        boolean z4;
        float f12;
        float f13;
        boolean z10;
        float f14;
        float f15;
        float f16;
        boolean z11;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i12;
        canvas.save();
        this.D1.setEmpty();
        int childCount = getChildCount();
        int i13 = 0;
        MessageObject.GroupedMessages groupedMessages = null;
        while (true) {
            f10 = 0.0f;
            i10 = 4;
            i11 = 2;
            f11 = 2.0f;
            z4 = true;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 4) {
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup2 = t1Var.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                        MessageObject.GroupedMessagePosition currentPosition = t1Var.getCurrentPosition();
                        ta0 backgroundDrawable = t1Var.getBackgroundDrawable();
                        if ((backgroundDrawable.f31302f || t1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                            int y10 = (int) t1Var.getY();
                            canvas.save();
                            if (currentPosition == null) {
                                i12 = t1Var.getMeasuredHeight();
                            } else {
                                int measuredHeight = t1Var.getMeasuredHeight() + y10;
                                long j10 = 0;
                                float f17 = 0.0f;
                                for (int i14 = 0; i14 < childCount; i14++) {
                                    View childAt2 = getChildAt(i14);
                                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                        org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt2;
                                        if (t1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                            ta0 backgroundDrawable2 = t1Var2.getBackgroundDrawable();
                                            int min = Math.min(y10, (int) t1Var2.getY());
                                            int max = Math.max(measuredHeight, t1Var2.getMeasuredHeight() + ((int) t1Var2.getY()));
                                            long j11 = backgroundDrawable2.f31307l;
                                            if (j11 > j10) {
                                                float x10 = t1Var2.getX() + backgroundDrawable2.h;
                                                f17 = t1Var2.getY() + backgroundDrawable2.f31304i;
                                                f10 = x10;
                                                j10 = j11;
                                            }
                                            y10 = min;
                                            measuredHeight = max;
                                        }
                                    }
                                }
                                backgroundDrawable.f31305j = f10;
                                backgroundDrawable.f31306k = f17 - y10;
                                i12 = measuredHeight - y10;
                            }
                            int i15 = i12 + y10;
                            canvas.clipRect(0, y10, getMeasuredWidth(), i15);
                            backgroundDrawable.f31299b = null;
                            backgroundDrawable.f31298a.setColor(k6.v0(k6.Hc, this.f31383m2));
                            backgroundDrawable.setBounds(0, y10, getMeasuredWidth(), i15);
                            backgroundDrawable.draw(canvas);
                            canvas.restore();
                        }
                        groupedMessages = currentMessagesGroup2;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.I()) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                        canvas.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                        v0Var.y(canvas, true);
                        v0Var.B(canvas, true);
                        canvas.restore();
                    }
                }
            }
            i13++;
        }
        int i16 = 0;
        while (i16 < 3) {
            ArrayList arrayList = this.Y2;
            arrayList.clear();
            if (i16 != i11 || this.U1) {
                int i17 = 0;
                while (i17 < childCount) {
                    View childAt3 = getChildAt(i17);
                    if (childAt3 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var3 = (org.telegram.ui.Cells.t1) childAt3;
                        if (childAt3.getY() <= getHeight() && childAt3.getY() + childAt3.getHeight() >= f10 && t1Var3.getVisibility() != i10 && t1Var3.getVisibility() != 8 && (currentMessagesGroup = t1Var3.getCurrentMessagesGroup()) != null && ((i16 != 0 || currentMessagesGroup.messages.size() != z4) && ((i16 != z4 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i16 != 0 || !t1Var3.getMessageObject().deleted) && ((i16 != z4 || t1Var3.getMessageObject().deleted) && ((i16 != i11 || t1Var3.f23937lc) && (i16 == i11 || !t1Var3.f23937lc))))))) {
                            if (!arrayList.contains(currentMessagesGroup)) {
                                MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                transitionParams.left = 0;
                                transitionParams.top = 0;
                                transitionParams.right = 0;
                                transitionParams.bottom = 0;
                                transitionParams.pinnedBotton = false;
                                transitionParams.pinnedTop = false;
                                transitionParams.cell = t1Var3;
                                arrayList.add(currentMessagesGroup);
                            }
                            currentMessagesGroup.transitionParams.pinnedTop = t1Var3.n3();
                            currentMessagesGroup.transitionParams.pinnedBotton = t1Var3.m3();
                            int backgroundDrawableLeft = t1Var3.getBackgroundDrawableLeft() + t1Var3.getLeft();
                            int backgroundDrawableRight = t1Var3.getBackgroundDrawableRight() + t1Var3.getLeft();
                            int backgroundDrawableTop = t1Var3.getBackgroundDrawableTop() + t1Var3.getPaddingTop() + t1Var3.getTop();
                            int backgroundDrawableBottom = t1Var3.getBackgroundDrawableBottom() + t1Var3.getPaddingTop() + t1Var3.getTop();
                            if ((t1Var3.getCurrentPosition().flags & i10) == 0) {
                                backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                            }
                            int i18 = backgroundDrawableTop;
                            if ((t1Var3.getCurrentPosition().flags & 8) == 0) {
                                backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                            }
                            int i19 = backgroundDrawableBottom;
                            if (t1Var3.f23937lc) {
                                currentMessagesGroup.transitionParams.cell = t1Var3;
                            }
                            MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                            int i20 = transitionParams2.top;
                            if (i20 == 0 || i18 < i20) {
                                transitionParams2.top = i18;
                            }
                            int i21 = transitionParams2.bottom;
                            if (i21 == 0 || i19 > i21) {
                                transitionParams2.bottom = i19;
                            }
                            int i22 = transitionParams2.left;
                            if (i22 == 0 || backgroundDrawableLeft < i22) {
                                transitionParams2.left = backgroundDrawableLeft;
                            }
                            int i23 = transitionParams2.right;
                            if (i23 == 0 || backgroundDrawableRight > i23) {
                                transitionParams2.right = backgroundDrawableRight;
                            }
                            i17++;
                            i11 = 2;
                            f10 = 0.0f;
                        }
                    }
                    i17++;
                    i11 = 2;
                    f10 = 0.0f;
                }
                int i24 = 0;
                while (i24 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i24);
                    float E2 = groupedMessages2.transitionParams.cell.E2(z4);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f18 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f19 = transitionParams3.top + transitionParams3.offsetTop;
                    float f20 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f21 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f19 += transitionParams3.cell.getTranslationY();
                        f21 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f22 = f19;
                    float f23 = f21;
                    if (groupedMessages2.transitionParams.cell.getScaleX() == 1.0f && groupedMessages2.transitionParams.cell.getScaleY() == 1.0f) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        canvas.save();
                        canvas.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), e2.c.x(f20, f18, f11, f18), e2.c.x(f23, f22, f11, f22));
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    ArrayList arrayList2 = arrayList;
                    transitionParams4.cell.B1(canvas, (int) f18, (int) f22, (int) f20, (int) f23, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, false, 0);
                    MessageObject.GroupedMessages.TransitionParams transitionParams5 = groupedMessages2.transitionParams;
                    transitionParams5.cell = null;
                    transitionParams5.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z11) {
                        canvas.restore();
                        for (int i25 = 0; i25 < childCount; i25++) {
                            View childAt4 = getChildAt(i25);
                            if (childAt4 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var4 = (org.telegram.ui.Cells.t1) childAt4;
                                if (t1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = t1Var4.getLeft();
                                    int top = t1Var4.getTop();
                                    childAt4.setPivotX(((f20 - f18) / 2.0f) + (f18 - left));
                                    childAt4.setPivotY(((f23 - f22) / 2.0f) + (f22 - top));
                                }
                            }
                        }
                    }
                    i24++;
                    arrayList = arrayList2;
                    f11 = 2.0f;
                    z4 = true;
                }
            }
            i16++;
            i11 = 2;
            f11 = 2.0f;
            z4 = true;
            f10 = 0.0f;
            i10 = 4;
        }
        boolean z12 = 1;
        super.dispatchDraw(canvas);
        ArrayList arrayList3 = this.U2;
        int size = arrayList3.size();
        if (size > 0) {
            for (int i26 = 0; i26 < size; i26++) {
                org.telegram.ui.Cells.t1 t1Var5 = (org.telegram.ui.Cells.t1) arrayList3.get(i26);
                canvas.save();
                canvas.translate(t1Var5.E2(false) + t1Var5.getLeft(), t1Var5.getY());
                if (t1Var5.a()) {
                    f16 = t1Var5.getAlpha();
                } else {
                    f16 = 1.0f;
                }
                t1Var5.m2(f16, canvas, true);
                canvas.restore();
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.V2;
        int size2 = arrayList4.size();
        if (size2 > 0) {
            for (int i27 = 0; i27 < size2; i27++) {
                org.telegram.ui.Cells.t1 t1Var6 = (org.telegram.ui.Cells.t1) arrayList4.get(i27);
                float E22 = t1Var6.E2(false) + t1Var6.getLeft();
                float y11 = t1Var6.getY();
                if (t1Var6.a()) {
                    f15 = t1Var6.getAlpha();
                } else {
                    f15 = 1.0f;
                }
                canvas.save();
                canvas.translate(E22, y11);
                t1Var6.setInvalidatesParent(true);
                t1Var6.W1(canvas, f15);
                t1Var6.setInvalidatesParent(false);
                canvas.restore();
            }
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.W2;
        int size3 = arrayList5.size();
        if (size3 > 0) {
            int i28 = 0;
            while (i28 < size3) {
                org.telegram.ui.Cells.t1 t1Var7 = (org.telegram.ui.Cells.t1) arrayList5.get(i28);
                if (t1Var7.getCurrentPosition() != null && (t1Var7.getCurrentPosition().flags & z12) == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (t1Var7.a()) {
                    f14 = t1Var7.getAlpha();
                } else {
                    f14 = 1.0f;
                }
                float E23 = t1Var7.E2(false) + t1Var7.getLeft();
                float y12 = t1Var7.getY();
                canvas.save();
                MessageObject.GroupedMessages currentMessagesGroup3 = t1Var7.getCurrentMessagesGroup();
                if (currentMessagesGroup3 != null && currentMessagesGroup3.transitionParams.backgroundChangeBounds) {
                    float E24 = t1Var7.E2(z12);
                    MessageObject.GroupedMessages.TransitionParams transitionParams6 = currentMessagesGroup3.transitionParams;
                    float f24 = transitionParams6.left + E24 + transitionParams6.offsetLeft;
                    float f25 = transitionParams6.top + transitionParams6.offsetTop;
                    float f26 = transitionParams6.right + E24 + transitionParams6.offsetRight;
                    float f27 = transitionParams6.bottom + transitionParams6.offsetBottom;
                    if (!transitionParams6.backgroundChangeBounds) {
                        f25 += t1Var7.getTranslationY();
                        f27 += t1Var7.getTranslationY();
                    }
                    canvas.clipRect(f24 + AndroidUtilities.dp(8.0f), f25 + AndroidUtilities.dp(8.0f), f26 - AndroidUtilities.dp(8.0f), f27 - AndroidUtilities.dp(8.0f));
                }
                if (t1Var7.getTransitionParams().f23702v0) {
                    canvas.translate(E23, y12);
                    t1Var7.setInvalidatesParent(true);
                    t1Var7.I1(f14, canvas, z10);
                    t1Var7.setInvalidatesParent(false);
                    canvas.restore();
                }
                i28++;
                z12 = 1;
            }
            f12 = 8.0f;
            arrayList5.clear();
        } else {
            f12 = 8.0f;
        }
        ArrayList arrayList6 = this.X2;
        int size4 = arrayList6.size();
        if (size4 > 0) {
            for (int i29 = 0; i29 < size4; i29++) {
                org.telegram.ui.Cells.t1 t1Var8 = (org.telegram.ui.Cells.t1) arrayList6.get(i29);
                if (t1Var8.getCurrentPosition() == null || (t1Var8.getCurrentPosition().flags & 1) != 0) {
                    if (t1Var8.a()) {
                        f13 = t1Var8.getAlpha();
                    } else {
                        f13 = 1.0f;
                    }
                    float E25 = t1Var8.E2(false) + t1Var8.getLeft();
                    float y13 = t1Var8.getY();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup4 = t1Var8.getCurrentMessagesGroup();
                    if (currentMessagesGroup4 != null && currentMessagesGroup4.transitionParams.backgroundChangeBounds) {
                        float E26 = t1Var8.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams7 = currentMessagesGroup4.transitionParams;
                        float f28 = transitionParams7.left + E26 + transitionParams7.offsetLeft;
                        float f29 = transitionParams7.top + transitionParams7.offsetTop;
                        float f30 = transitionParams7.right + E26 + transitionParams7.offsetRight;
                        float f31 = transitionParams7.bottom + transitionParams7.offsetBottom;
                        if (!transitionParams7.backgroundChangeBounds) {
                            f29 += t1Var8.getTranslationY();
                            f31 += t1Var8.getTranslationY();
                        }
                        canvas.clipRect(f28 + AndroidUtilities.dp(f12), f29 + AndroidUtilities.dp(f12), f30 - AndroidUtilities.dp(f12), f31 - AndroidUtilities.dp(f12));
                    }
                    if (t1Var8.getTransitionParams().f23702v0) {
                        canvas.translate(E25, y13);
                        t1Var8.setInvalidatesParent(true);
                        t1Var8.d2(canvas, f13, null);
                        t1Var8.N1(canvas, f13);
                        t1Var8.setInvalidatesParent(false);
                        canvas.restore();
                    }
                }
            }
            arrayList6.clear();
        }
        canvas.restore();
    }

    @Override
    public final boolean drawChild(android.graphics.Canvas r20, android.view.View r21, long r22) {
        throw new UnsupportedOperationException("Method not decompiled: eg.r1.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }
}
