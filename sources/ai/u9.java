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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.h01;
public final class u9 implements fc {
    public final wl0 f1581a;
    public final h01 f1582b;
    public final int[] f1583c;
    public final boolean d;
    public t9 e;
    public boolean f1584f;
    public boolean h;
    public boolean f1585n;
    public boolean f1586r;
    public int f1587s;

    public u9(wl0 wl0Var, boolean z10) {
        this.f1583c = new int[2];
        this.f1581a = wl0Var;
        this.d = z10;
        this.f1582b = null;
    }

    public static u9 a(wl0 wl0Var) {
        return new u9(wl0Var, false);
    }

    @Override
    public final void Z(long j3, int i10, d5 d5Var) {
        ArrayList arrayList;
        wl0 wl0Var = this.f1581a;
        if (wl0Var != null && (wl0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) wl0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f547b0.add(d5Var);
                return;
            } else {
                d5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (wl0Var != null && (wl0Var.getParent() instanceof k7)) {
            k7 k7Var = (k7) wl0Var.getParent();
            qz qzVar = k7Var.f1136x;
            e7 e7Var = k7Var.f1135w;
            if (e7Var != null && (arrayList = e7Var.f851c) != null && qzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        z6 z6Var = (z6) arrayList.get(i11);
                        if (z6Var != null) {
                            TL_stories.StoryReaction storyReaction = z6Var.f1781c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f18556id == i10) {
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
                    int L0 = qzVar.L0();
                    int N0 = qzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        qzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        wl0Var.post(d5Var);
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
            NotificationCenter.getInstance(storiesController.f1192a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        d5Var.run();
    }

    @Override
    public final void b(boolean z10) {
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.b(z10);
        }
    }

    public final void c(gc gcVar) {
        View view = gcVar.f917g;
        if (view == null) {
            return;
        }
        if (view instanceof s9) {
            int[] iArr = this.f1583c;
            ((s9) view).a(iArr);
            gcVar.h = iArr[0];
            gcVar.f918i = iArr[1] - this.f1587s;
        } else if (view instanceof org.telegram.ui.Components.ia) {
            gcVar.h = ((org.telegram.ui.Components.ia) view).X2;
            gcVar.f918i = (view.getMeasuredHeight() - gcVar.f917g.getPaddingBottom()) - this.f1587s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.f918i = (gcVar.f917g.getMeasuredHeight() - gcVar.f917g.getPaddingBottom()) - this.f1587s;
        }
    }

    @Override
    public final boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        dc dcVar = null;
        gcVar.f913a = null;
        gcVar.f914b = null;
        gcVar.f915c = null;
        gcVar.e = null;
        wl0 wl0Var = this.f1581a;
        if (wl0Var != null && (wl0Var.getParent() instanceof b0)) {
            b0Var = (b0) wl0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f565r;
        } else {
            viewGroup = wl0Var;
        }
        ViewGroup viewGroup2 = this.f1582b;
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
                        gcVar.f913a = childAt;
                        gcVar.f914b = a0Var.f499r;
                        gcVar.f922m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.f917g = b0Var2;
                        gcVar.f918i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.f920k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f916f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f916f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.f21006u0;
                    long dialogId = s2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && s2Var.O())) {
                        gcVar.f913a = childAt;
                        gcVar.f922m = k2Var;
                        gcVar.f914b = imageReceiver;
                        gcVar.f917g = (View) s2Var.getParent();
                        if (z11) {
                            gcVar.f921l = imageReceiver;
                            boolean z12 = k2Var.f674w;
                        }
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        gcVar.f913a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            gcVar.f915c = u1Var.F9;
                        } else {
                            gcVar.f915c = u1Var.getPhotoImage();
                        }
                        gcVar.f917g = (View) u1Var.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.f913a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.f914b = w0Var.getPhotoImage();
                        } else {
                            gcVar.f915c = w0Var.getPhotoImage();
                        }
                        gcVar.f917g = (View) w0Var.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.t7) && wl0Var != null) {
                    org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) childAt;
                    MessageObject messageObject = t7Var.getMessageObject();
                    if ((t7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        dl0 fastScroll = wl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.f913a = childAt;
                        gcVar.f915c = t7Var.f21200c;
                        gcVar.e = new q5(t7Var, fastScroll, iArr, 1);
                        gcVar.f917g = (View) t7Var.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.za) {
                    org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) childAt;
                    if (zaVar.getDialogId() == j3) {
                        y5 y5Var = zaVar.f21912a;
                        gcVar.f913a = y5Var;
                        gcVar.f922m = zaVar.T;
                        gcVar.f914b = y5Var.getImageReceiver();
                        gcVar.f917g = (View) zaVar.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.o6) {
                    org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                    org.telegram.ui.Components.w9 w9Var = o6Var.h;
                    if (o6Var.f20754x != j3) {
                        continue;
                    } else {
                        if (w9Var != null && w9Var.getImageReceiver() != null && w9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (o6Var.f20750n == i11 && z10) {
                            gcVar.f913a = w9Var;
                            gcVar.f915c = w9Var.getImageReceiver();
                            gcVar.f917g = (View) o6Var.getParent();
                            float alphaInternal = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f920k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.f919j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19115h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.n6 n6Var = o6Var.f20748c;
                            gcVar.f913a = n6Var;
                            gcVar.f922m = o6Var.f20755y;
                            gcVar.f914b = n6Var.getImageReceiver();
                            gcVar.f917g = (View) o6Var.getParent();
                            float alphaInternal2 = o6Var.getAlphaInternal() * o6Var.getAlpha();
                            gcVar.f920k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.f919j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19115h5, o6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.i6) {
                    org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                    if (i6Var.getDialogId() == j3) {
                        gcVar.f913a = i6Var;
                        gcVar.f922m = i6Var.f20439u0;
                        gcVar.f914b = i6Var.f20434r;
                        gcVar.f917g = (View) i6Var.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c8) {
                    org.telegram.ui.Cells.c8 c8Var = (org.telegram.ui.Cells.c8) childAt;
                    if (c8Var.getPostInfo().b() == i11) {
                        gcVar.f913a = c8Var.getImageView();
                        gcVar.f922m = c8Var.getStoryAvatarParams();
                        gcVar.f915c = c8Var.getImageView().getImageReceiver();
                        gcVar.f917g = (View) c8Var.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.b5) {
                    org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                    if (b5Var.getStoryItem() != null && b5Var.getStoryItem().dialogId == j3 && b5Var.getStoryItem().messageId == i10) {
                        gcVar.f913a = b5Var.getAvatarImageView();
                        gcVar.f922m = b5Var.getStoryAvatarParams();
                        gcVar.f914b = b5Var.getAvatarImageView().getImageReceiver();
                        gcVar.f917g = (View) b5Var.getParent();
                        gcVar.f920k = 1.0f;
                        c(gcVar);
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

    public u9(h01 h01Var) {
        this.f1583c = new int[2];
        this.f1582b = h01Var;
        this.f1581a = null;
    }
}
