package ai;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class i6 {
    public final int f979a;
    public final ImageReceiver f980b;
    public int f981c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.c6 f982f;
    public final org.telegram.ui.Components.c6 f983g;
    public final org.telegram.ui.Components.c6 h;
    public float f984i;
    public float f985j;
    public float f986k;
    public final boolean f987l;
    public final RectF f988m;
    public final RectF f989n;

    public i6(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f980b = imageReceiver;
        this.f981c = 0;
        this.d = false;
        this.e = 1.0f;
        qr qrVar = qr.h;
        this.f982f = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.f983g = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.h = new org.telegram.ui.Components.c6(profileStoriesView, 420L, qrVar);
        this.f988m = new RectF();
        this.f989n = new RectF();
        this.f979a = storyItem.f18348id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f987l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f31544x) {
            imageReceiver.onAttachedToWindow();
        }
        o20[] o20VarArr = ia.f1010a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            f9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, f9Var);
        } else if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), storyItem.media.document), "25_25", null, null, ImageLoader.createStripedBitmap(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
        } else {
            if (messageMedia != null) {
                photo = messageMedia.photo;
            } else {
                photo = null;
            }
            if (photo != null && (arrayList = photo.sizes) != null) {
                imageReceiver.setImage(null, null, ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(arrayList, AndroidUtilities.dp(Math.max(25, 25)), false, null, true), photo), "25_25", null, null, ImageLoader.createStripedBitmap(photo.sizes), 0L, null, storyItem, 0);
            } else {
                imageReceiver.clearImage();
            }
        }
    }
}
