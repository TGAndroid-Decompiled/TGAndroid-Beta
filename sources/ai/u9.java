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
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.q01;
public final class u9 implements fc {
    public final yl0 f1583a;
    public final q01 f1584b;
    public final int[] f1585c;
    public final boolean d;
    public t9 e;
    public boolean f1586f;
    public boolean h;
    public boolean f1587n;
    public boolean f1588r;
    public int f1589s;

    public u9(yl0 yl0Var, boolean z10) {
        this.f1585c = new int[2];
        this.f1583a = yl0Var;
        this.d = z10;
        this.f1584b = null;
    }

    public static u9 a(yl0 yl0Var) {
        return new u9(yl0Var, false);
    }

    @Override
    public final void Z(long j3, int i10, e5 e5Var) {
        ArrayList arrayList;
        yl0 yl0Var = this.f1583a;
        if (yl0Var != null && (yl0Var.getParent() instanceof b0)) {
            b0 b0Var = (b0) yl0Var.getParent();
            if (b0Var.k(j3)) {
                b0Var.f540b0.add(e5Var);
                return;
            } else {
                e5Var.run();
                return;
            }
        }
        int i11 = 0;
        if (yl0Var != null && (yl0Var.getParent() instanceof j7)) {
            j7 j7Var = (j7) yl0Var.getParent();
            pz pzVar = j7Var.f1052x;
            e7 e7Var = j7Var.f1051w;
            if (e7Var != null && (arrayList = e7Var.f766c) != null && pzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        z6 z6Var = (z6) arrayList.get(i11);
                        if (z6Var != null) {
                            TL_stories.StoryReaction storyReaction = z6Var.f1784c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j3 && tL_storyReactionPublicRepost.story.f18578id == i10) {
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
                    int L0 = pzVar.L0();
                    int N0 = pzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        pzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        yl0Var.post(e5Var);
                        return;
                    }
                }
            }
            e5Var.run();
            return;
        }
        if (this.d) {
            l9 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f1190a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        e5Var.run();
    }

    @Override
    public final void b(boolean z10) {
        t9 t9Var = this.e;
        if (t9Var != null) {
            t9Var.b(z10);
        }
    }

    public final void c(gc gcVar) {
        View view = gcVar.f916g;
        if (view == null) {
            return;
        }
        if (view instanceof s9) {
            int[] iArr = this.f1585c;
            ((s9) view).a(iArr);
            gcVar.h = iArr[0];
            gcVar.f917i = iArr[1] - this.f1589s;
        } else if (view instanceof org.telegram.ui.Components.ha) {
            gcVar.h = ((org.telegram.ui.Components.ha) view).X2;
            gcVar.f917i = (view.getMeasuredHeight() - gcVar.f916g.getPaddingBottom()) - this.f1589s;
        } else {
            gcVar.h = view.getPaddingTop();
            gcVar.f917i = (gcVar.f916g.getMeasuredHeight() - gcVar.f916g.getPaddingBottom()) - this.f1589s;
        }
    }

    @Override
    public final boolean f1(long j3, int i10, int i11, int i12, gc gcVar) {
        b0 b0Var;
        ViewGroup viewGroup;
        boolean z10;
        dc dcVar = null;
        gcVar.f912a = null;
        gcVar.f913b = null;
        gcVar.f914c = null;
        gcVar.e = null;
        yl0 yl0Var = this.f1583a;
        if (yl0Var != null && (yl0Var.getParent() instanceof b0)) {
            b0Var = (b0) yl0Var.getParent();
        } else {
            b0Var = null;
        }
        if (b0Var != null && !b0Var.g()) {
            viewGroup = b0Var.f558r;
        } else {
            viewGroup = yl0Var;
        }
        ViewGroup viewGroup2 = this.f1584b;
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
                        gcVar.f912a = childAt;
                        gcVar.f913b = a0Var.f499r;
                        gcVar.f921m = a0Var.O;
                        gcVar.d = a0Var.R;
                        b0 b0Var2 = (b0) a0Var.getParent().getParent();
                        gcVar.f916g = b0Var2;
                        gcVar.f917i = 0.0f;
                        gcVar.h = 0.0f;
                        gcVar.f919k = 1.0f;
                        if (a0Var.G && b0Var2.g()) {
                            gcVar.f915f = new a1.c(new Path(), 7);
                            return true;
                        }
                        gcVar.f915f = dcVar;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s2) {
                    org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) childAt;
                    ImageReceiver imageReceiver = s2Var.Y1;
                    org.telegram.ui.Cells.k2 k2Var = s2Var.f21038u0;
                    long dialogId = s2Var.getDialogId();
                    boolean z11 = this.d;
                    if ((dialogId == j3 && !z11) || (z11 && s2Var.O())) {
                        gcVar.f912a = childAt;
                        gcVar.f921m = k2Var;
                        gcVar.f913b = imageReceiver;
                        gcVar.f916g = (View) s2Var.getParent();
                        if (z11) {
                            gcVar.f920l = imageReceiver;
                            boolean z12 = k2Var.f665w;
                        }
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var.getMessageObject().getId() == i10) {
                        gcVar.f912a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            gcVar.f914c = u1Var.F9;
                        } else {
                            gcVar.f914c = u1Var.getPhotoImage();
                        }
                        gcVar.f916g = (View) u1Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (w0Var.getMessageObject().getId() == i10) {
                        gcVar.f912a = childAt;
                        if (w0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            gcVar.f913b = w0Var.getPhotoImage();
                        } else {
                            gcVar.f914c = w0Var.getPhotoImage();
                        }
                        gcVar.f916g = (View) w0Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.u7) && yl0Var != null) {
                    org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) childAt;
                    MessageObject messageObject = u7Var.getMessageObject();
                    if ((u7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j3)) {
                        fl0 fastScroll = yl0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        gcVar.f912a = childAt;
                        gcVar.f914c = u7Var.f21638c;
                        gcVar.e = new r5(u7Var, fastScroll, iArr, 1);
                        gcVar.f916g = (View) u7Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.ab) {
                    org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) childAt;
                    if (abVar.getDialogId() == j3) {
                        z5 z5Var = abVar.f20050a;
                        gcVar.f912a = z5Var;
                        gcVar.f921m = abVar.T;
                        gcVar.f913b = z5Var.getImageReceiver();
                        gcVar.f916g = (View) abVar.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p6) {
                    org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) childAt;
                    org.telegram.ui.Components.v9 v9Var = p6Var.h;
                    if (p6Var.f20829x != j3) {
                        continue;
                    } else {
                        if (v9Var != null && v9Var.getImageReceiver() != null && v9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (p6Var.f20825n == i11 && z10) {
                            gcVar.f912a = v9Var;
                            gcVar.f914c = v9Var.getImageReceiver();
                            gcVar.f916g = (View) p6Var.getParent();
                            float alphaInternal = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            gcVar.f919k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                gcVar.f918j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, p6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.o6 o6Var = p6Var.f20823c;
                            gcVar.f912a = o6Var;
                            gcVar.f921m = p6Var.f20830y;
                            gcVar.f913b = o6Var.getImageReceiver();
                            gcVar.f916g = (View) p6Var.getParent();
                            float alphaInternal2 = p6Var.getAlphaInternal() * p6Var.getAlpha();
                            gcVar.f919k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                gcVar.f918j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19180h5, p6Var.getResourcesProvider()));
                            }
                            c(gcVar);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.j6) {
                    org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                    if (j6Var.getDialogId() == j3) {
                        gcVar.f912a = j6Var;
                        gcVar.f921m = j6Var.f20510u0;
                        gcVar.f913b = j6Var.f20505r;
                        gcVar.f916g = (View) j6Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.d8) {
                    org.telegram.ui.Cells.d8 d8Var = (org.telegram.ui.Cells.d8) childAt;
                    if (d8Var.getPostInfo().b() == i11) {
                        gcVar.f912a = d8Var.getImageView();
                        gcVar.f921m = d8Var.getStoryAvatarParams();
                        gcVar.f914c = d8Var.getImageView().getImageReceiver();
                        gcVar.f916g = (View) d8Var.getParent();
                        gcVar.f919k = 1.0f;
                        c(gcVar);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.c5) {
                    org.telegram.ui.Cells.c5 c5Var = (org.telegram.ui.Cells.c5) childAt;
                    if (c5Var.getStoryItem() != null && c5Var.getStoryItem().dialogId == j3 && c5Var.getStoryItem().messageId == i10) {
                        gcVar.f912a = c5Var.getAvatarImageView();
                        gcVar.f921m = c5Var.getStoryAvatarParams();
                        gcVar.f913b = c5Var.getAvatarImageView().getImageReceiver();
                        gcVar.f916g = (View) c5Var.getParent();
                        gcVar.f919k = 1.0f;
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

    public u9(q01 q01Var) {
        this.f1585c = new int[2];
        this.f1584b = q01Var;
        this.f1583a = null;
    }
}
