package jh;

import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.tl.TL_stories;

public abstract class f8 {
    public static void a(TL_stories.StoryItem storyItem, NativeByteBuffer nativeByteBuffer) {
        if (nativeByteBuffer == null) {
            return;
        }
        int int32 = nativeByteBuffer.readInt32(true);
        if (int32 != 1) {
            throw new RuntimeException(i0.a.k(int32, "(story) can't read params version = "));
        }
        new e8(storyItem).readParams(nativeByteBuffer, true);
    }

    public static NativeByteBuffer b(TL_stories.StoryItem storyItem) {
        if (storyItem.detectedLng == null && storyItem.translatedLng == null && !storyItem.translated && storyItem.translatedText == null) {
            return null;
        }
        e8 e8Var = new e8(storyItem);
        try {
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(e8Var.getObjectSize());
            e8Var.serializeToStream(nativeByteBuffer);
            return nativeByteBuffer;
        } catch (Exception e9) {
            e9.printStackTrace();
            return null;
        }
    }
}
