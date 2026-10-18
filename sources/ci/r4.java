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
public final class r4 {
    public final int f5853a;
    public final ImageReceiver f5854b;
    public int f5855c;
    public boolean d;
    public float e;
    public final org.telegram.ui.Components.f6 f5856f;
    public final org.telegram.ui.Components.f6 f5857g;
    public final org.telegram.ui.Components.f6 h;
    public float f5858i;
    public float f5859j;
    public float f5860k;
    public final boolean f5861l;
    public final RectF f5862m;
    public final RectF f5863n;

    public r4(ProfileStoriesView profileStoriesView, TL_stories.StoryItem storyItem) {
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f5854b = imageReceiver;
        this.f5855c = 0;
        this.d = false;
        this.e = 1.0f;
        bs bsVar = bs.h;
        this.f5856f = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.f5857g = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.h = new org.telegram.ui.Components.f6(profileStoriesView, 420L, bsVar);
        this.f5862m = new RectF();
        this.f5863n = new RectF();
        this.f5853a = storyItem.f20506id;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(200.0f));
        imageReceiver.setParentView(profileStoriesView);
        this.f5861l = storyItem.media instanceof TLRPC.TL_messageMediaVideoStream;
        if (profileStoriesView.f33877x) {
            imageReceiver.onAttachedToWindow();
        }
        x20[] x20VarArr = c8.f5223a;
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
