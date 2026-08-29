package lh;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l6 {
    public int f15893a;
    public String f15894b;
    public TLRPC.Photo f15895c;
    public TLRPC.Document d;

    public static l6 a(TL_stories.TL_storyAlbum tL_storyAlbum) {
        ?? obj = new Object();
        obj.f15893a = tL_storyAlbum.album_id;
        obj.f15894b = tL_storyAlbum.title;
        obj.f15895c = tL_storyAlbum.icon_photo;
        obj.d = tL_storyAlbum.icon_video;
        return obj;
    }
}
