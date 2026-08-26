package org.telegram.messenger.audioinfo.mp3;

import android.animation.ObjectAnimator;
import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda211;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda420;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.Bulletin$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Bulletin$2$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda14;

public final class MP3Info extends AudioInfo {
    public static final Logger LOGGER = Logger.getLogger(MP3Info.class.getName());

    public final class AnonymousClass1 implements Bulletin.Layout.Transition {
        public long stopPosition;

        @Override
        public void animateEnter(Bulletin.Layout layout, ChatActivity$$ExternalSyntheticLambda420 chatActivity$$ExternalSyntheticLambda420, Bulletin$2$$ExternalSyntheticLambda1 bulletin$2$$ExternalSyntheticLambda1, Bulletin$2$$ExternalSyntheticLambda2 bulletin$2$$ExternalSyntheticLambda2) {
            layout.setInOutOffset(layout.getMeasuredHeight());
            bulletin$2$$ExternalSyntheticLambda2.accept(Float.valueOf(layout.getTranslationY()));
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(layout, Bulletin.Layout.IN_OUT_OFFSET_Y2, 0.0f);
            objectAnimatorOfFloat.setDuration(this.stopPosition);
            objectAnimatorOfFloat.setInterpolator(Easings.easeOutQuad);
            objectAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass74(9, chatActivity$$ExternalSyntheticLambda420, bulletin$2$$ExternalSyntheticLambda1));
            objectAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(10, bulletin$2$$ExternalSyntheticLambda2, layout));
            objectAnimatorOfFloat.start();
        }

        @Override
        public void animateExit(Bulletin.Layout layout, ChatActivity$$ExternalSyntheticLambda420 chatActivity$$ExternalSyntheticLambda420, Bulletin$$ExternalSyntheticLambda0 bulletin$$ExternalSyntheticLambda0, ChatActivity$$ExternalSyntheticLambda211 chatActivity$$ExternalSyntheticLambda211) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(layout, Bulletin.Layout.IN_OUT_OFFSET_Y2, layout.getHeight());
            objectAnimatorOfFloat.setDuration(175L);
            objectAnimatorOfFloat.setInterpolator(Easings.easeInQuad);
            objectAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass74(10, chatActivity$$ExternalSyntheticLambda420, bulletin$$ExternalSyntheticLambda0));
            objectAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda14(9, chatActivity$$ExternalSyntheticLambda211, layout));
            objectAnimatorOfFloat.start();
        }

        public boolean stopRead(MP3Input mP3Input) {
            return mP3Input.position == this.stopPosition && ID3v1Info.isID3v1StartPosition(mP3Input);
        }
    }

    public MP3Info(java.io.BufferedInputStream r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.audioinfo.mp3.MP3Info.<init>(java.io.BufferedInputStream, long):void");
    }

    public static long calculateDuration(org.telegram.messenger.audioinfo.mp3.MP3Input r32, long r33, org.telegram.messenger.audioinfo.mp3.MP3Info.AnonymousClass1 r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.audioinfo.mp3.MP3Info.calculateDuration(org.telegram.messenger.audioinfo.mp3.MP3Input, long, org.telegram.messenger.audioinfo.mp3.MP3Info$1):long");
    }
}
