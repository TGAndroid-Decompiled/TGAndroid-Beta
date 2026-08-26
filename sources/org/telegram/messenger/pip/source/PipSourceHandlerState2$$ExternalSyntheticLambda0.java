package org.telegram.messenger.pip.source;

import android.os.Build;
import android.util.Log;
import androidx.activity.ComponentDialog$$ExternalSyntheticLambda1;
import androidx.appcompat.widget.TooltipPopup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.pip.PipActivityContentLayout;
import org.telegram.messenger.pip.utils.Trigger;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.MHTML;

public final class PipSourceHandlerState2$$ExternalSyntheticLambda0 {
    public final int $r8$classId;
    public final PipSourceHandlerState2 f$0;

    public PipSourceHandlerState2$$ExternalSyntheticLambda0(PipSourceHandlerState2 pipSourceHandlerState2, int i) {
        this.$r8$classId = i;
        this.f$0 = pipSourceHandlerState2;
    }

    public final void run(boolean z) {
        switch (this.$r8$classId) {
            case 0:
                final PipSourceHandlerState2 pipSourceHandlerState2 = this.f$0;
                pipSourceHandlerState2.getClass();
                final int i = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                PipSourceHandlerState2 pipSourceHandlerState3 = pipSourceHandlerState2;
                                if (pipSourceHandlerState3.state == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    pipSourceHandlerState3.pipSourcePlaceholder.stopPlaceholderForSource();
                                    pipSourceHandlerState3.source.delegate.pipHidePrimaryWindowView(new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState3, 2), 400L));
                                    pipSourceHandlerState3.state = 2;
                                    if (!pipSourceHandlerState3.shouldBeAttached) {
                                        pipSourceHandlerState3.performPreDetach1();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + pipSourceHandlerState3.state);
                                }
                                break;
                            case 1:
                                PipSourceHandlerState2 pipSourceHandlerState4 = pipSourceHandlerState2;
                                if (pipSourceHandlerState4.state == 4) {
                                    TooltipPopup tooltipPopup = pipSourceHandlerState4.source.controller;
                                    if (((PipActivityContentLayout) tooltipPopup.mMessageView) == null) {
                                        tooltipPopup.mMessageView = new PipActivityContentLayout((LaunchActivity) tooltipPopup.mLayoutParams);
                                    }
                                    ((PipActivityContentLayout) tooltipPopup.mMessageView).removeView(pipSourceHandlerState4.pictureInPictureWrapperView);
                                    pipSourceHandlerState4.pictureInPictureView = null;
                                    pipSourceHandlerState4.pictureInPictureWrapperView = null;
                                    pipSourceHandlerState4.pictureInPicturePlaceholderView = null;
                                    PipSourceSnapshot pipSourceSnapshot = pipSourceHandlerState4.contentForeground;
                                    if (pipSourceSnapshot != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            pipSourceSnapshot.node.discardDisplayList();
                                        }
                                        pipSourceHandlerState4.contentForeground = null;
                                    }
                                    PipSourceSnapshot pipSourceSnapshot2 = pipSourceHandlerState4.contentBackground;
                                    if (pipSourceSnapshot2 != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            pipSourceSnapshot2.node.discardDisplayList();
                                        }
                                        pipSourceHandlerState4.contentBackground = null;
                                    }
                                    pipSourceHandlerState4.pipSourcePlaceholder.stopPlaceholderForActivity();
                                    pipSourceHandlerState4.state = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (pipSourceHandlerState4.shouldBeAttached) {
                                        pipSourceHandlerState4.performPreAttach();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + pipSourceHandlerState4.state);
                                }
                                break;
                            default:
                                PipSourceHandlerState2 pipSourceHandlerState5 = pipSourceHandlerState2;
                                if (pipSourceHandlerState5.state == 3) {
                                    pipSourceHandlerState5.source.delegate.pipShowPrimaryWindowView(new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState5, 3), 400L));
                                    pipSourceHandlerState5.pictureInPictureWrapperView.invalidate();
                                    pipSourceHandlerState5.state = 4;
                                    AndroidUtilities.doOnPreDraw(pipSourceHandlerState5.source.contentView, new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState5, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + pipSourceHandlerState5.state);
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final PipSourceHandlerState2 pipSourceHandlerState3 = this.f$0;
                pipSourceHandlerState3.getClass();
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                PipSourceHandlerState2 pipSourceHandlerState4 = pipSourceHandlerState3;
                                if (pipSourceHandlerState4.state == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    pipSourceHandlerState4.pipSourcePlaceholder.stopPlaceholderForSource();
                                    pipSourceHandlerState4.source.delegate.pipHidePrimaryWindowView(new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState4, 2), 400L));
                                    pipSourceHandlerState4.state = 2;
                                    if (!pipSourceHandlerState4.shouldBeAttached) {
                                        pipSourceHandlerState4.performPreDetach1();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + pipSourceHandlerState4.state);
                                }
                                break;
                            case 1:
                                PipSourceHandlerState2 pipSourceHandlerState5 = pipSourceHandlerState3;
                                if (pipSourceHandlerState5.state == 4) {
                                    TooltipPopup tooltipPopup = pipSourceHandlerState5.source.controller;
                                    if (((PipActivityContentLayout) tooltipPopup.mMessageView) == null) {
                                        tooltipPopup.mMessageView = new PipActivityContentLayout((LaunchActivity) tooltipPopup.mLayoutParams);
                                    }
                                    ((PipActivityContentLayout) tooltipPopup.mMessageView).removeView(pipSourceHandlerState5.pictureInPictureWrapperView);
                                    pipSourceHandlerState5.pictureInPictureView = null;
                                    pipSourceHandlerState5.pictureInPictureWrapperView = null;
                                    pipSourceHandlerState5.pictureInPicturePlaceholderView = null;
                                    PipSourceSnapshot pipSourceSnapshot = pipSourceHandlerState5.contentForeground;
                                    if (pipSourceSnapshot != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            pipSourceSnapshot.node.discardDisplayList();
                                        }
                                        pipSourceHandlerState5.contentForeground = null;
                                    }
                                    PipSourceSnapshot pipSourceSnapshot2 = pipSourceHandlerState5.contentBackground;
                                    if (pipSourceSnapshot2 != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            pipSourceSnapshot2.node.discardDisplayList();
                                        }
                                        pipSourceHandlerState5.contentBackground = null;
                                    }
                                    pipSourceHandlerState5.pipSourcePlaceholder.stopPlaceholderForActivity();
                                    pipSourceHandlerState5.state = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (pipSourceHandlerState5.shouldBeAttached) {
                                        pipSourceHandlerState5.performPreAttach();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + pipSourceHandlerState5.state);
                                }
                                break;
                            default:
                                PipSourceHandlerState2 pipSourceHandlerState6 = pipSourceHandlerState3;
                                if (pipSourceHandlerState6.state == 3) {
                                    pipSourceHandlerState6.source.delegate.pipShowPrimaryWindowView(new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState6, 3), 400L));
                                    pipSourceHandlerState6.pictureInPictureWrapperView.invalidate();
                                    pipSourceHandlerState6.state = 4;
                                    AndroidUtilities.doOnPreDraw(pipSourceHandlerState6.source.contentView, new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState6, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + pipSourceHandlerState6.state);
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                this.f$0.pipSourcePlaceholder.stopPlaceholderForActivity();
                Log.i("PIP_DEBUG", "[HANDLER] on new source render first frame " + z);
                break;
            case 3:
                PipSourceHandlerState2 pipSourceHandlerState4 = this.f$0;
                pipSourceHandlerState4.getClass();
                Log.i("PIP_DEBUG", "[HANDLER] on old source render first frame " + z);
                MHTML mhtml = pipSourceHandlerState4.pipSourcePlaceholder;
                Objects.requireNonNull(mhtml);
                AndroidUtilities.runOnUIThread(new ComponentDialog$$ExternalSyntheticLambda1(mhtml, 22));
                break;
            default:
                final PipSourceHandlerState2 pipSourceHandlerState5 = this.f$0;
                pipSourceHandlerState5.getClass();
                final int i3 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                PipSourceHandlerState2 pipSourceHandlerState6 = pipSourceHandlerState5;
                                if (pipSourceHandlerState6.state == 1) {
                                    Log.i("PIP_DEBUG", "[HANDLER] attach");
                                    pipSourceHandlerState6.pipSourcePlaceholder.stopPlaceholderForSource();
                                    pipSourceHandlerState6.source.delegate.pipHidePrimaryWindowView(new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState6, 2), 400L));
                                    pipSourceHandlerState6.state = 2;
                                    if (!pipSourceHandlerState6.shouldBeAttached) {
                                        pipSourceHandlerState6.performPreDetach1();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_ATTACHED: " + pipSourceHandlerState6.state);
                                }
                                break;
                            case 1:
                                PipSourceHandlerState2 pipSourceHandlerState7 = pipSourceHandlerState5;
                                if (pipSourceHandlerState7.state == 4) {
                                    TooltipPopup tooltipPopup = pipSourceHandlerState7.source.controller;
                                    if (((PipActivityContentLayout) tooltipPopup.mMessageView) == null) {
                                        tooltipPopup.mMessageView = new PipActivityContentLayout((LaunchActivity) tooltipPopup.mLayoutParams);
                                    }
                                    ((PipActivityContentLayout) tooltipPopup.mMessageView).removeView(pipSourceHandlerState7.pictureInPictureWrapperView);
                                    pipSourceHandlerState7.pictureInPictureView = null;
                                    pipSourceHandlerState7.pictureInPictureWrapperView = null;
                                    pipSourceHandlerState7.pictureInPicturePlaceholderView = null;
                                    PipSourceSnapshot pipSourceSnapshot = pipSourceHandlerState7.contentForeground;
                                    if (pipSourceSnapshot != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            pipSourceSnapshot.node.discardDisplayList();
                                        }
                                        pipSourceHandlerState7.contentForeground = null;
                                    }
                                    PipSourceSnapshot pipSourceSnapshot2 = pipSourceHandlerState7.contentBackground;
                                    if (pipSourceSnapshot2 != null) {
                                        if (Build.VERSION.SDK_INT >= 29) {
                                            pipSourceSnapshot2.node.discardDisplayList();
                                        }
                                        pipSourceHandlerState7.contentBackground = null;
                                    }
                                    pipSourceHandlerState7.pipSourcePlaceholder.stopPlaceholderForActivity();
                                    pipSourceHandlerState7.state = 0;
                                    Log.i("PIP_DEBUG", "[HANDLER] detach");
                                    if (pipSourceHandlerState7.shouldBeAttached) {
                                        pipSourceHandlerState7.performPreAttach();
                                    }
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_2: " + pipSourceHandlerState7.state);
                                }
                                break;
                            default:
                                PipSourceHandlerState2 pipSourceHandlerState8 = pipSourceHandlerState5;
                                if (pipSourceHandlerState8.state == 3) {
                                    pipSourceHandlerState8.source.delegate.pipShowPrimaryWindowView(new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState8, 3), 400L));
                                    pipSourceHandlerState8.pictureInPictureWrapperView.invalidate();
                                    pipSourceHandlerState8.state = 4;
                                    AndroidUtilities.doOnPreDraw(pipSourceHandlerState8.source.contentView, new Trigger(ApplicationLoader.applicationHandler, new PipSourceHandlerState2$$ExternalSyntheticLambda0(pipSourceHandlerState8, 4), 300L));
                                    Log.i("PIP_DEBUG", "[HANDLER] pre detach 2");
                                } else {
                                    FileLog.e("[PIP_DEBUG] wrong pip state STATE_PRE_DETACHED_1: " + pipSourceHandlerState8.state);
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
