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
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.c01;
public final class q7 implements u9 {
    public final nm0 f9059a;
    public final c01 f9060b;
    public final int[] f9061c;
    public final boolean d;
    public p7 e;
    public boolean f9062f;
    public boolean h;
    public boolean f9063n;
    public boolean f9064r;
    public int f9065s;

    public q7(nm0 nm0Var, boolean z10) {
        this.f9061c = new int[2];
        this.f9059a = nm0Var;
        this.d = z10;
        this.f9060b = null;
    }

    public static q7 a(nm0 nm0Var) {
        return new q7(nm0Var, false);
    }

    @Override
    public final void G0(long j10, int i10, s3 s3Var) {
        ArrayList arrayList;
        nm0 nm0Var = this.f9059a;
        if (nm0Var != null && (nm0Var.getParent() instanceof r)) {
            r rVar = (r) nm0Var.getParent();
            if (rVar.k(j10)) {
                rVar.f9073b0.add(s3Var);
                return;
            } else {
                s3Var.run();
                return;
            }
        }
        int i11 = 0;
        if (nm0Var != null && (nm0Var.getParent() instanceof t5)) {
            t5 t5Var = (t5) nm0Var.getParent();
            yz yzVar = t5Var.f9198x;
            o5 o5Var = t5Var.f9197w;
            if (o5Var != null && (arrayList = o5Var.f8878c) != null && yzVar != null) {
                while (true) {
                    if (i11 < arrayList.size()) {
                        j5 j5Var = (j5) arrayList.get(i11);
                        if (j5Var != null) {
                            TL_stories.StoryReaction storyReaction = j5Var.f8696c;
                            if (storyReaction instanceof TL_stories.TL_storyReactionPublicRepost) {
                                TL_stories.TL_storyReactionPublicRepost tL_storyReactionPublicRepost = (TL_stories.TL_storyReactionPublicRepost) storyReaction;
                                if (tL_storyReactionPublicRepost.story != null && DialogObject.getPeerDialogId(tL_storyReactionPublicRepost.peer_id) == j10 && tL_storyReactionPublicRepost.story.f22267id == i10) {
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
                        nm0Var.post(s3Var);
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
            NotificationCenter.getInstance(storiesController.f8629a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
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
        View view = v9Var.f9272g;
        if (view == null) {
            return;
        }
        if (view instanceof o7) {
            int[] iArr = this.f9061c;
            ((o7) view).a(iArr);
            v9Var.h = iArr[0];
            v9Var.f9273i = iArr[1] - this.f9065s;
        } else if (view instanceof ka) {
            v9Var.h = ((ka) view).f29912f3;
            v9Var.f9273i = (view.getMeasuredHeight() - v9Var.f9272g.getPaddingBottom()) - this.f9065s;
        } else {
            v9Var.h = view.getPaddingTop();
            v9Var.f9273i = (v9Var.f9272g.getMeasuredHeight() - v9Var.f9272g.getPaddingBottom()) - this.f9065s;
        }
    }

    @Override
    public final boolean i1(long j10, int i10, int i11, int i12, v9 v9Var) {
        r rVar;
        ViewGroup viewGroup;
        boolean z10;
        s9 s9Var = null;
        v9Var.f9268a = null;
        v9Var.f9269b = null;
        v9Var.f9270c = null;
        v9Var.e = null;
        nm0 nm0Var = this.f9059a;
        if (nm0Var != null && (nm0Var.getParent() instanceof r)) {
            rVar = (r) nm0Var.getParent();
        } else {
            rVar = null;
        }
        if (rVar != null && !rVar.g()) {
            viewGroup = rVar.f9091r;
        } else {
            viewGroup = nm0Var;
        }
        ViewGroup viewGroup2 = this.f9060b;
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
                        v9Var.f9268a = childAt;
                        v9Var.f9269b = qVar.f8941r;
                        v9Var.f9277m = qVar.O;
                        v9Var.d = qVar.R;
                        r rVar2 = (r) qVar.getParent().getParent();
                        v9Var.f9272g = rVar2;
                        v9Var.f9273i = 0.0f;
                        v9Var.h = 0.0f;
                        v9Var.f9275k = 1.0f;
                        if (qVar.G && rVar2.g()) {
                            v9Var.f9271f = new a1.c(new Path(), 26);
                            return true;
                        }
                        v9Var.f9271f = s9Var;
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.p2) {
                    org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) childAt;
                    ImageReceiver imageReceiver = p2Var.Y1;
                    org.telegram.ui.Cells.i2 i2Var = p2Var.f24731u0;
                    int i14 = (p2Var.getDialogId() > j10 ? 1 : (p2Var.getDialogId() == j10 ? 0 : -1));
                    boolean z11 = this.d;
                    if ((i14 == 0 && !z11) || (z11 && p2Var.N())) {
                        v9Var.f9268a = childAt;
                        v9Var.f9277m = i2Var;
                        v9Var.f9269b = imageReceiver;
                        v9Var.f9272g = (View) p2Var.getParent();
                        if (z11) {
                            v9Var.f9276l = imageReceiver;
                            boolean z12 = i2Var.f9329w;
                        }
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var.getMessageObject().getId() == i10) {
                        v9Var.f9268a = childAt;
                        if (i12 != 1 && i12 != 2) {
                            v9Var.f9270c = s1Var.F9;
                        } else {
                            v9Var.f9270c = s1Var.getPhotoImage();
                        }
                        v9Var.f9272g = (View) s1Var.getParent();
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (v0Var.getMessageObject().getId() == i10) {
                        v9Var.f9268a = childAt;
                        if (v0Var.getMessageObject().messageOwner.media.storyItem.noforwards) {
                            v9Var.f9269b = v0Var.getPhotoImage();
                        } else {
                            v9Var.f9270c = v0Var.getPhotoImage();
                        }
                        v9Var.f9272g = (View) v0Var.getParent();
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if ((childAt instanceof org.telegram.ui.Cells.w7) && nm0Var != null) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    MessageObject messageObject = w7Var.getMessageObject();
                    if ((w7Var.getStyle() == 1 && i11 == 0) || (messageObject != null && messageObject.isStory() && messageObject.getId() == i11 && messageObject.storyItem.dialogId == j10)) {
                        tl0 fastScroll = nm0Var.getFastScroll();
                        int[] iArr = new int[2];
                        if (fastScroll != null) {
                            fastScroll.getLocationInWindow(iArr);
                        }
                        v9Var.f9268a = childAt;
                        v9Var.f9270c = w7Var.f25640c;
                        v9Var.e = new androidx.car.app.utils.a(w7Var, fastScroll, iArr, 5);
                        v9Var.f9272g = (View) w7Var.getParent();
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof ab) {
                    ab abVar = (ab) childAt;
                    if (abVar.getDialogId() == j10) {
                        k4 k4Var = abVar.f23873a;
                        v9Var.f9268a = k4Var;
                        v9Var.f9277m = abVar.T;
                        v9Var.f9269b = k4Var.getImageReceiver();
                        v9Var.f9272g = (View) abVar.getParent();
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.s6) {
                    org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) childAt;
                    org.telegram.ui.Components.y9 y9Var = s6Var.h;
                    if (s6Var.f25403y != j10) {
                        continue;
                    } else {
                        if (y9Var != null && y9Var.getImageReceiver() != null && y9Var.getImageReceiver().getImageDrawable() != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (s6Var.f25398n == i11 && z10) {
                            v9Var.f9268a = y9Var;
                            v9Var.f9270c = y9Var.getImageReceiver();
                            v9Var.f9272g = (View) s6Var.getParent();
                            float alphaInternal = s6Var.getAlphaInternal() * s6Var.getAlpha();
                            v9Var.f9275k = alphaInternal;
                            if (alphaInternal < 1.0f) {
                                Paint paint = new Paint(1);
                                v9Var.f9274j = paint;
                                paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, s6Var.getResourcesProvider()));
                            }
                            c(v9Var);
                            return true;
                        } else if (!z10) {
                            org.telegram.ui.Cells.r6 r6Var = s6Var.f25396c;
                            v9Var.f9268a = r6Var;
                            v9Var.f9277m = s6Var.E;
                            v9Var.f9269b = r6Var.getImageReceiver();
                            v9Var.f9272g = (View) s6Var.getParent();
                            float alphaInternal2 = s6Var.getAlphaInternal() * s6Var.getAlpha();
                            v9Var.f9275k = alphaInternal2;
                            if (alphaInternal2 < 1.0f) {
                                Paint paint2 = new Paint(1);
                                v9Var.f9274j = paint2;
                                paint2.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23428h5, s6Var.getResourcesProvider()));
                            }
                            c(v9Var);
                            return true;
                        }
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.m6) {
                    org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                    if (m6Var.getDialogId() == j10) {
                        v9Var.f9268a = m6Var;
                        v9Var.f9277m = m6Var.f24477u0;
                        v9Var.f9269b = m6Var.f24472r;
                        v9Var.f9272g = (View) m6Var.getParent();
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f8) {
                    org.telegram.ui.Cells.f8 f8Var = (org.telegram.ui.Cells.f8) childAt;
                    if (f8Var.getPostInfo().b() == i11) {
                        v9Var.f9268a = f8Var.getImageView();
                        v9Var.f9277m = f8Var.getStoryAvatarParams();
                        v9Var.f9270c = f8Var.getImageView().getImageReceiver();
                        v9Var.f9272g = (View) f8Var.getParent();
                        v9Var.f9275k = 1.0f;
                        c(v9Var);
                        return true;
                    }
                } else if (childAt instanceof org.telegram.ui.Cells.f5) {
                    org.telegram.ui.Cells.f5 f5Var = (org.telegram.ui.Cells.f5) childAt;
                    if (f5Var.getStoryItem() != null && f5Var.getStoryItem().dialogId == j10 && f5Var.getStoryItem().messageId == i10) {
                        v9Var.f9268a = f5Var.getAvatarImageView();
                        v9Var.f9277m = f5Var.getStoryAvatarParams();
                        v9Var.f9269b = f5Var.getAvatarImageView().getImageReceiver();
                        v9Var.f9272g = (View) f5Var.getParent();
                        v9Var.f9275k = 1.0f;
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

    public q7(c01 c01Var) {
        this.f9061c = new int[2];
        this.f9060b = c01Var;
        this.f9059a = null;
    }
}
