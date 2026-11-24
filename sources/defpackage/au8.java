package defpackage;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class au8 {
    public final int a;
    public final ImageReceiver b;
    public int c;
    public boolean d;
    public float e;
    public final ln f;
    public final ln g;
    public final ln h;
    public float i;
    public float j;
    public float k;
    public final boolean l;
    public final RectF m;
    public final RectF n;

    public au8(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        pc0 pc0Var = new pc0((ylb) null);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        this.c = 0;
        this.d = false;
        this.e = 1.0f;
        d53 d53Var = d53.h;
        this.f = new ln(420L, profileStoriesView, d53Var);
        this.g = new ln(420L, profileStoriesView, d53Var);
        this.h = new ln(420L, profileStoriesView, d53Var);
        this.m = new RectF();
        this.n = new RectF();
        this.a = storyItem.id;
        imageReceiver.q0(gm.L(200.0f));
        imageReceiver.p0(profileStoriesView);
        this.l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.y) {
            imageReceiver.I();
        }
        j15[] j15VarArr = y4b.a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject a2 = oc7.r1(imageReceiver.d).a2(storyItem.dialogId);
            pc0Var.k(a2);
            imageReceiver.U(a2, pc0Var, null);
            return;
        }
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                imageReceiver.Z(gn5.c(bc4.w(document.thumbs, gm.L(25.0f), false, null, true), storyItem.media.document), "25_25", null, null, fn5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                return;
            }
            photo = messageMedia.photo;
        } else {
            photo = null;
        }
        if (photo != null && (arrayList = photo.sizes) != null) {
            imageReceiver.Y(null, null, gn5.i(bc4.w(arrayList, gm.L(25.0f), false, null, true), photo), "25_25", null, null, fn5.i(photo.sizes), 0L, null, storyItem, 0);
        } else {
            imageReceiver.f();
        }
    }
}
