package di;

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
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.a01;
public final class q7 implements u9 {
    public final mm0 f9060a;
    public final a01 f9061b;
    public final int[] f9062c;
    public final boolean d;
    public p7 e;
    public boolean f9063f;
    public boolean h;
    public boolean f9064n;
    public boolean f9065r;
    public int f9066s;

    public q7(mm0 mm0Var, boolean z10) {
        this.f9062c = new int[2];
        this.f9060a = mm0Var;
        this.d = z10;
        this.f9061b = null;
    }

    public static q7 a(mm0 mm0Var) {
        return new q7(mm0Var, false);
    }

    @Override
    public final void G0(long j10, int i10, s3 s3Var) {
        ArrayList arrayList;
        mm0 mm0Var = this.f9060a;
        if (mm0Var != null && (mm0Var.getParent() instanceof r)) {
            r rVar = (r) mm0Var.getParent();
            if (rVar.k(j10)) {
                rVar.f9074b0.add(s3Var);
                return;
            } else {
                s3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (mm0Var != null && (mm0Var.getParent() instanceof t5)) {
            t5 t5Var = (t5) mm0Var.getParent();
            yz yzVar = t5Var.f9199x;
            o5 o5Var = t5Var.f9198w;
            if (o5Var != null && (arrayList = o5Var.f8879c) != null && yzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        j5 j5Var = (j5) arrayList.get(i11);
                        if (j5Var != null) {
                            TL_stories.StoryReaction storyReaction = j5Var.f8697c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f22264id == i10) {
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
                    int L0 = yzVar.L0();
                    int N0 = yzVar.N0();
                    if (i11 < L0 || i11 > N0) {
                        yzVar.h1(i11, AndroidUtilities.dp(60.0f));
                        mm0Var.post(s3Var);
                        return;
                    }
                }
            }
            s3Var.run();
            return;
        }
        if (this.d) {
            h7 storiesController = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController();
            ArrayList arrayList2 = storiesController.h;
            storiesController.v(arrayList2);
            Collections.sort(arrayList2, storiesController.J);
            NotificationCenter.getInstance(storiesController.f8630a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        s3Var.run();
    }

    @Override
    public final void b(boolean z10) {
        p7 p7Var = this.e;
        if (p7Var != null) {
            p7Var.b(z10);
        }
    }

    public final void c(v9 v9Var) {
        View view = v9Var.f9273g;
        if (view == null) {
            return;
        }
        if (view instanceof o7) {
            int[] iArr = this.f9062c;
            ((o7) view).a(iArr);
            v9Var.h = iArr[0];
            v9Var.f9274i = iArr[1] - this.f9066s;
        } else if (view instanceof ka) {
            v9Var.h = ((ka) view).f29884f3;
            v9Var.f9274i = (view.getMeasuredHeight() - v9Var.f9273g.getPaddingBottom()) - this.f9066s;
        } else {
            v9Var.h = view.getPaddingTop();
            v9Var.f9274i = (v9Var.f9273g.getMeasuredHeight() - v9Var.f9273g.getPaddingBottom()) - this.f9066s;
        }
    }

    @Override
    public final boolean i1(long j10, int i10, int i11, int i12, v9 v9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        s9 s9Var = null;
        v9Var.f9269a = null;
        v9Var.f9270b = null;
        v9Var.f9271c = null;
        v9Var.e = null;
        mm0 mm0Var = this.f9060a;
        if (mm0Var != null && (mm0Var.getParent() instanceof r)) {
            rVar = (r) mm0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f9092r;
        } else {
            viewGroup = mm0Var;
        }
        ViewGroup viewGroup2 = this.f9061b;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        if (viewGroup != null) {
            int i13 = 0;
            while (i13 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i13);
                if (childAt instanceof q) {
                    q qVar = (q) childAt;
                    if (qVar.E == j10) {
                        v9Var.f9269a = childAt;
                        v9Var.f9270b = qVar.f8942r;
                        v9Var.f9278m = qVar.O;
                        v9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        v9Var.f9273g = rVar2;
                        v9Var.f9274i = 0.0f;
                        v9Var.h = 0.0f;
                        v9Var.f9276k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            v9Var.f9272f = new a1.c(new Path(), 26);
                            return true;
                        }
                        v9Var.f9272f = s9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                    ImageReceiver imageReceiver = p2Var.Y1;
                    org.telegram.ui.Cells.i2 i2Var = p2Var.f24727u0;
                    int i14 = (p2Var.getDialogId() > j10 ? 1 : (p2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && p2Var.N())) {
                        v9Var.f9269a = childAt;
                        v9Var.f9278m = i2Var;
                        v9Var.f9270b = imageReceiver;
                        v9Var.f9273g = (View) p2Var.getParent();
                        if (z11) {
                            v9Var.f9277l = imageReceiver;
                            boolean z12 = i2Var.f9330w;
                        }
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        v9Var.f9269a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            v9Var.f9271c = s1Var.F9;
                        } else {
                            v9Var.f9271c = s1Var.getPhotoImage();
                        }
                        v9Var.f9273g = (View) s1Var.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        v9Var.f9269a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            v9Var.f9270b = v0Var.getPhotoImage();
                        } else {
                            v9Var.f9271c = v0Var.getPhotoImage();
                        }
                        v9Var.f9273g = (View) v0Var.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.w7) && mm0Var != null) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    MessageObject messageObject = w7Var.getMessageObject();
                    if ((w7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        sl0 fastScroll = mm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        v9Var.f9269a = childAt;
                        v9Var.f9271c = w7Var.f25636c;
                        v9Var.e = new androidx.car.app.utils.a(w7Var, fastScroll, iArr, 5);
                        v9Var.f9273g = (View) w7Var.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof ab) {
                    ab abVar = (ab) childAt;
                    if (abVar.getDialogId() == j10) {
                        k4 k4Var = abVar.f23870a;
                        v9Var.f9269a = k4Var;
                        v9Var.f9278m = abVar.T;
                        v9Var.f9270b = k4Var.getImageReceiver();
                        v9Var.f9273g = (View) abVar.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s6) {
                    org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) childAt;
                    org.telegram.ui.Components.y9 y9Var = s6Var.h;
                    if (s6Var.f25399y != j10) {
                        continue;
                    } else {
                        if (y9Var != null && y9Var.getImageReceiver() != null && y9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (s6Var.f25394n == i11 && z10) {
                            v9Var.f9269a = y9Var;
                            v9Var.f9271c = y9Var.getImageReceiver();
                            v9Var.f9273g = (View) s6Var.getParent();
                            float alphaInternal = s6Var.getAlphaInternal() * s6Var.getAlpha();
                            v9Var.f9276k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                v9Var.f9275j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, s6Var.getResourcesProvider()));
                            }
                            c(v9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.r6 r6Var = s6Var.f25392c;
                            v9Var.f9269a = r6Var;
                            v9Var.f9278m = s6Var.E;
                            v9Var.f9270b = r6Var.getImageReceiver();
                            v9Var.f9273g = (View) s6Var.getParent();
                            float alphaInternal2 = s6Var.getAlphaInternal() * s6Var.getAlpha();
                            v9Var.f9276k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                v9Var.f9275j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23425h5, s6Var.getResourcesProvider()));
                            }
                            c(v9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    if (m6Var.getDialogId() == j10) {
                        v9Var.f9269a = m6Var;
                        v9Var.f9278m = m6Var.f24473u0;
                        v9Var.f9270b = m6Var.f24468r;
                        v9Var.f9273g = (View) m6Var.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) childAt;
                    if (f8Var.getPostInfo().b() == i11) {
                        v9Var.f9269a = f8Var.getImageView();
                        v9Var.f9278m = f8Var.getStoryAvatarParams();
                        v9Var.f9271c = f8Var.getImageView().getImageReceiver();
                        v9Var.f9273g = (View) f8Var.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) childAt;
                    if (f5Var.getStoryItem() != null && f5Var.getStoryItem().dialogId == j10 && f5Var.getStoryItem().messageId == i10) {
                        v9Var.f9269a = f5Var.getAvatarImageView();
                        v9Var.f9278m = f5Var.getStoryAvatarParams();
                        v9Var.f9270b = f5Var.getAvatarImageView().getImageReceiver();
                        v9Var.f9273g = (View) f5Var.getParent();
                        v9Var.f9276k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else {
                    continue;
                }
                i13++;
                s9Var = null;
            }
        }
        return false;
    }

    public q7(a01 a01Var) {
        this.f9062c = new int[2];
        this.f9061b = a01Var;
        this.f9060a = null;
    }
}
