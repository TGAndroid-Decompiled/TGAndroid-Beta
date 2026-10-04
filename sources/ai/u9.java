package ai;

import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.j01;
public final class u9 implements fc {
    public final zl0 f1721a;
    public final j01 f1722b;
    public final int[] f1723c;
    public final boolean d;
    public t9 f1724e;
    public boolean f1725f;
    public boolean h;
    public boolean f1726n;
    public boolean f1727r;
    public int f1728s;

    public u9(zl0 zl0Var, boolean z10) {
        this.f1723c = new int[2];
        this.f1721a = zl0Var;
        this.d = z10;
        this.f1722b = null;
    }

    public static u9 a(zl0 zl0Var) {
        return new u9(zl0Var, false);
    }

    @Override
    public final void a0(long j3, int i10, d5 d5Var) {
        ArrayList arrayList;
        zl0 zl0Var = this.f1721a;
        if (zl0Var != null && (zl0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) zl0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f596b0.add(d5Var);
                return;
            } else {
                d5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (zl0Var != null && (zl0Var.getParent() instanceof k7)) {
            k7 k7Var = (k7) zl0Var.getParent();
            sz szVar = k7Var.f1224x;
            e7 e7Var = k7Var.f1223w;
            if (e7Var != null && (arrayList = e7Var.f919c) != null && szVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        z6 z6Var = (z6) arrayList.get(i11);
                        if (z6Var != null) {
                            TL_stories.StoryReaction storyReaction = z6Var.f1936c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f20275id == i10) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    int L0 = szVar.L0();
                    int N0 = szVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        szVar.h1(i11, AndroidUtilities.dp(60.0f));
                        zl0Var.post(d5Var);
                        return;
                    }
                }
            }
            d5Var.run();
            return;
        }
        if (this.d) {
            l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f1290a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        d5Var.run();
    }

    public final void b(gc gcVar) {
        View view = gcVar.f994g;
        if (view == null) {
            return;
        }
        if (view instanceof s9) {
            int[] iArr = this.f1723c;
            ((s9) view).a(iArr);
            gcVar.h = iArr[0];
            gcVar.f995i = iArr[1] - this.f1728s;
        } else if (view instanceof org.telegram.ui.Components.ja) {
            gcVar.h = ((org.telegram.ui.Components.ja) view).f27701e3;
            gcVar.f995i = (view.getMeasuredHeight() - gcVar.f994g.getPaddingBottom()) - this.f1728s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.f995i = (gcVar.f994g.getMeasuredHeight() - gcVar.f994g.getPaddingBottom()) - this.f1728s;
        }
    }

    @Override
    public final void f(boolean z10) {
        t9 t9Var = this.f1724e;
        if (t9Var != null) {
            t9Var.f(z10);
        }
    }

    @Override
    public final boolean i1(long j3, int i10, int i11, int i12, gc gcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        dc dcVar = null;
        gcVar.f989a = null;
        gcVar.f990b = null;
        gcVar.f991c = null;
        gcVar.f992e = null;
        zl0 zl0Var = this.f1721a;
        if (zl0Var != null && (zl0Var.getParent() instanceof b0)) {
            b0Var = (b0) zl0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f615r;
        } else {
            viewGroup = zl0Var;
        }
        ViewGroup viewGroup2 = this.f1722b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof a0) {
                    a0 a0Var = (a0) childAt;
                    if (a0Var.E == j3) {
                        gcVar.f989a = childAt;
                        gcVar.f990b = a0Var.f545r;
                        gcVar.f999m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.f994g = b0Var2;
                        gcVar.f995i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.f997k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f993f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f993f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.f22869u0;
                    long dialogId = s2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && s2Var.M())) {
                        gcVar.f989a = childAt;
                        gcVar.f999m = k2Var;
                        gcVar.f990b = imageReceiver;
                        gcVar.f994g = (View) s2Var.getParent();
                        if (z11) {
                            gcVar.f998l = imageReceiver;
                            boolean z12 = k2Var.f731w;
                        }
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        gcVar.f989a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            gcVar.f991c = u1Var.F9;
                        } else {
                            gcVar.f991c = u1Var.getPhotoImage();
                        }
                        gcVar.f994g = (View) u1Var.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.f989a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.f990b = w0Var.getPhotoImage();
                        } else {
                            gcVar.f991c = w0Var.getPhotoImage();
                        }
                        gcVar.f994g = (View) w0Var.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && zl0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        fl0 fastScroll = zl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.f989a = childAt;
                        gcVar.f991c = t7Var.f23072c;
                        gcVar.f992e = new q5(t7Var, fastScroll, iArr, 1);
                        gcVar.f994g = (View) t7Var.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.za) {
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                    if (zaVar.getDialogId() == j3) {
                        y5 y5Var = zaVar.f23818a;
                        gcVar.f989a = y5Var;
                        gcVar.f999m = zaVar.T;
                        gcVar.f990b = y5Var.getImageReceiver();
                        gcVar.f994g = (View) zaVar.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.w9 w9Var = o6Var.h;
                    if (o6Var.f22605x != j3) {
                        continue;
                    } else {
                        if (w9Var != null && w9Var.getImageReceiver() != null && w9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f22601n == i11 && z10) {
                            gcVar.f989a = w9Var;
                            gcVar.f991c = w9Var.getImageReceiver();
                            gcVar.f994g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f997k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.f996j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20890h5, o6Var.getResourcesProvider()));
                            }
                            b(gcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f22598c;
                            gcVar.f989a = n6Var;
                            gcVar.f999m = o6Var.f22606y;
                            gcVar.f990b = n6Var.getImageReceiver();
                            gcVar.f994g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f997k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.f996j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20890h5, o6Var.getResourcesProvider()));
                            }
                            b(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j3) {
                        gcVar.f989a = i6Var;
                        gcVar.f999m = i6Var.f22267u0;
                        gcVar.f990b = i6Var.f22262r;
                        gcVar.f994g = (View) i6Var.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        gcVar.f989a = c8Var.getImageView();
                        gcVar.f999m = c8Var.getStoryAvatarParams();
                        gcVar.f991c = c8Var.getImageView().getImageReceiver();
                        gcVar.f994g = (View) c8Var.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        gcVar.f989a = b5Var.getAvatarImageView();
                        gcVar.f999m = b5Var.getStoryAvatarParams();
                        gcVar.f990b = b5Var.getAvatarImageView().getImageReceiver();
                        gcVar.f994g = (View) b5Var.getParent();
                        gcVar.f997k = 1.0f;
                        b(gcVar);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                dcVar = null;
            }
        }
        return false;
    }

    public u9(j01 j01Var) {
        this.f1723c = new int[2];
        this.f1722b = j01Var;
        this.f1721a = null;
    }
}
