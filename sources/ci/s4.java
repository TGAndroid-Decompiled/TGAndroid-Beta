package ci;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.x20;
import org.telegram.ui.Stories.ProfileStoriesView;
public final class s4 {
    public final int f5960a;
    public final ImageReceiver f5961b;
    public int f5962c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.f6 f5963f;
    public final org.telegram.ui.Components.f6 f5964g;
    public final org.telegram.ui.Components.f6 h;
    public float f5965i;
    public float f5966j;
    public float f5967k;
    public final boolean f5968l;
    public final RectF f5969m;
    public final RectF f5970n;

    public s4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f5961b = imageReceiver;
        this.f5962c = 0;
        this.d = false;
        this.e = 1.0f;
        bs bsVar = bs.h;
        this.f5963f = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.f5964g = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.h = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.f5969m = new RectF();
        this.f5970n = new RectF();
        this.f5960a = storyItem.f20506id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f5968l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f33877x) {
            imageReceiver.onAttachedToWindow();
        }
        x20[] x20VarArr = d8.f5325a;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
            TLObject userOrChat = MessagesController.getInstance(imageReceiver.getCurrentAccount()).getUserOrChat(storyItem.dialogId);
            h9Var.p(userOrChat);
            imageReceiver.setForUserOrChat(userOrChat, h9Var);
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
